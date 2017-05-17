package objectrepository;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
	
WebDriver driver;
	
	public SearchResultsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//variables
	String strsearchResultSummaryContainerCSSSelector = "div[class='result-summary-container']";
	
	@FindBy(css="div[class='result-summary-container']")
	WebElement searchResultSummaryContainer;
		
	//methods
	public WebElement searchResultSummaryContainer()
	{
	   return searchResultSummaryContainer;
	}
	
	public boolean verifySearchResultsSummaryExists(WebDriver driver)
	{
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		WebDriverWait Wait = new WebDriverWait(driver, 8);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(strsearchResultSummaryContainerCSSSelector)));
		if(driver.findElements(By.cssSelector(strsearchResultSummaryContainerCSSSelector)).size() == 0)
		{
			log.error("FAIL: Search Results Container Not Found");
			return false;
		}
		else
		{
			log.debug("SUCCESS: Search Results Container Found");
			return true;
		}		
	}	
	
}
