package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import objectrepository.HomePage;
import objectrepository.SearchResultsPage;
import objectrepository.TrackOrderPage;

public class HomePageTests {	
	
	@Test
	public void testSearchBoxFunctionality() throws IOException{
		
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		log.info("Reading TestData from Properties file");
		Properties TestDataProperties = new Properties();
		FileInputStream filePath = new FileInputStream("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\src\\testcases\\TestData.properties");
		TestDataProperties.load(filePath);
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		log.info("Opening Home Page");
		HomePage homePage = new HomePage(driver);		
		homePage.openHomePage(driver);
		
		//check Search text box functionality
		//When user enters a valid search text in this box and clicks on the submit button, 
		//then the search results page should be presented
		log.info("Checking Home Page functionality..");
		log.info("Entering text into the Search box");
		
		homePage.searchBox().sendKeys(TestDataProperties.getProperty("SearchKey"));
		log.info("Clicking 'Submit' button");
		homePage.submitButton().click();
		
		SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
		
		if(!searchResultsPage.verifySearchResultsSummaryExists(driver))
		{
			Assert.fail();
		}
		
		driver.close();
	}
	
	@Test
	public void testTrackOrdersFunctionality() throws IOException{
		
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		log.info("Reading TestData from Properties file");
		Properties TestDataProperties = new Properties();
		FileInputStream filePath = new FileInputStream("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\src\\testcases\\TestData.properties");
		TestDataProperties.load(filePath);
		
		log.info("Opening Home Page");
		HomePage homePage = new HomePage(driver);		
		homePage.openHomePage(driver);
		
		//check track orders functionality
		log.info("Checking Track Orders functionality..");
		log.info("Clicking TrackOrders link");
		homePage.trackOrdersLink().click();
		
		TrackOrderPage trackorderpage = new TrackOrderPage(driver);
		trackorderpage.checkIfTrackOrderFormExists(driver);
		trackorderpage.verifyErrorMessage(TestDataProperties.getProperty("EmailID"),
				  TestDataProperties.getProperty("OrderID"),
				  TestDataProperties.getProperty("ExpectedTrackOrderAlertMessage"),
				  driver);
		
		driver.close();
	}
}
