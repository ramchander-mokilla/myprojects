package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import objectrepository.HomePage;
import objectrepository.SearchResultsPage;
import objectrepository.TrackOrderPage;

public class DataDriven_POI {	
	
	@Test
	public void testSearchBoxFunctionality() throws IOException{
		
		int iRowIndex;
		
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Read test data from the external excel test data file
		log.info("Reading TestData from external xlsx file");
		FileInputStream filePath = new FileInputStream("C:\\Selenium\\Test_Data_1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);	
		XSSFSheet workSheet = workBook.getSheet("SearchBox");
		int iNumberOfRows = workSheet.getLastRowNum();
		log.info("Number of test data rows = " + iNumberOfRows);
			
		for(iRowIndex=1; iRowIndex<=iNumberOfRows; iRowIndex++)
		{
			XSSFRow testDataRow = workSheet.getRow(iRowIndex);
			XSSFCell testDataCell = testDataRow.getCell(0);
							
			log.info("Opening Home Page");
			HomePage homePage = new HomePage(driver);		
			homePage.openHomePage(driver);
			
			//check Search text box functionality
			//When user enters a valid search text in this box and clicks on the submit button, 
			//then the search results page should be presented
			log.info("Testing Search Textbox functionality with text = '"+testDataCell.getStringCellValue()+"'");
			
			homePage.searchBox().sendKeys(testDataCell.getStringCellValue());
			log.info("Clicking 'Submit' button");
			homePage.submitButton().click();
			SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
			if(!searchResultsPage.verifySearchResultsSummaryExists(driver))
			{
				Assert.fail();
			}		
			
		}

		//close the browser before exiting the test method
		log.info("Closing the browser");
		driver.close();
		
		//close the workbook before exiting the test method
		log.info("Closing the workbook");
		workBook.close();		
	}
	
	
	@Test
	public void testTrackOrdersFunctionality() throws IOException{
		
		int iRowIndex;
		
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Read test data from the external excel test data file
		log.info("Reading TestData from external xlsx file");
		FileInputStream filePath = new FileInputStream("C:\\Selenium\\Test_Data_1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);	
		XSSFSheet workSheet = workBook.getSheet("TrackOrder");
		int iNumberOfRows = workSheet.getLastRowNum();
		log.info("Number of test data rows = " + iNumberOfRows);
		
		for(iRowIndex=1; iRowIndex<=iNumberOfRows; iRowIndex++)
		{
			XSSFRow testDataRow = workSheet.getRow(iRowIndex);
			
			XSSFCell emailIDCell = testDataRow.getCell(0);
			XSSFCell orderNumberCell = testDataRow.getCell(1);
			XSSFCell errorMsgCell = testDataRow.getCell(2);
							
			log.info("Opening Home Page");
			HomePage homePage = new HomePage(driver);		
			homePage.openHomePage(driver);
		
			//check track orders functionality
			log.info("Checking Track Orders functionality..");
			log.info("Clicking TrackOrders link");
			homePage.trackOrdersLink().click();
		
			//creating formatter to handle numeric Order number as string
			DataFormatter formatter = new DataFormatter(); 
			//Returns the formatted value of order number as a String.
			String strOrderNumber = formatter.formatCellValue(orderNumberCell); 
			
			TrackOrderPage trackorderpage = new TrackOrderPage(driver);
			trackorderpage.checkIfTrackOrderFormExists(driver);
			trackorderpage.verifyErrorMessage(emailIDCell.getStringCellValue(), strOrderNumber,
											  errorMsgCell.getStringCellValue(), driver);
		}
		
		//close the browser before exiting the test method
		log.info("Closing the browser");
		driver.close();
				
		//close the workbook before exiting the test method
		log.info("Closing the workbook");
		workBook.close();
	}
}

