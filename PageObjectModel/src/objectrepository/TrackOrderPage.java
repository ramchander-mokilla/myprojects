package objectrepository;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TrackOrderPage {

	WebDriver driver;
	
	public TrackOrderPage(WebDriver driver){
		this.driver = driver;
	}
	
	//properties (elements/fields on the page)
	String strTrackOrderFrameXpath = "//form[@action='/account/trackorder']";
	By trackOrderFrame = By.xpath(strTrackOrderFrameXpath);
	By emailIDBox = By.id("email");
	By orderNumberBox = By.id("partialOrderId");
	By viewOrderStatusButton = By.cssSelector("button[class='m-margin-top btn btn-block']");
	By errorMessageBox = By.cssSelector("span[class='alert active alert-error alert-block']");
	
	//methods (operations on the fields on the page)
	public WebElement emailIDBox()
	{
		return driver.findElement(emailIDBox);
	}
	
	public WebElement orderNumberBox()
	{
		return driver.findElement(orderNumberBox);
	}
	
	public WebElement viewOrderStatusButton()
	{
		return driver.findElement(viewOrderStatusButton);
	}
	
	public WebElement errorMessageBox()
	{
		return driver.findElement(errorMessageBox);
	}
	
	public WebDriver checkIfTrackOrderFormExists(WebDriver driver)
	{
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
				
		WebDriverWait Wait = new WebDriverWait(driver, 8);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(trackOrderFrame));
		
		//driver.switchTo().frame(strTrackOrderFrameXpath);
		
		if(driver.findElements(trackOrderFrame).size() == 0)
		{
			log.error("FAIL: Track Order Page Elements Not Found");
			Assert.fail();
		}
		else
		{
			log.debug("SUCCESS: Track Order Page Elements Found");
		}		
		
		return driver;
	}
	
	public WebDriver verifyErrorMessage(String strEmailID, String strOrderID, 
										String strExpectedErrorMessage, WebDriver driver) throws IOException
	{
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		log.debug("Entering an Email ID");
		emailIDBox().sendKeys(strEmailID);
		
		log.debug("Entering an Order Number");
		orderNumberBox().sendKeys(strOrderID);

		log.debug("Clicking View Order Status Button");
		viewOrderStatusButton().click();

		WebDriverWait Wait = new WebDriverWait(driver, 8);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageBox));
				
		if(driver.findElements(errorMessageBox).size() == 0)
		{
			log.error("FAIL: Error Message Not Found");
			Assert.fail();
		}
		else
		{
			log.debug("Error Message Found");
			log.debug("Verifying the text of Error Message");
			log.debug("Expected Error Message : " + strExpectedErrorMessage);
			log.debug("Actual Error Message : " + errorMessageBox().getText());
			Assert.assertEquals(strExpectedErrorMessage, errorMessageBox().getText());
			log.debug("SUCCESS : Alert Message is as expected");
		}			
		
		return driver;
	}
	
}
