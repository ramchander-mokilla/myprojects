package objectrepository;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
	
WebDriver driver;
	
	public SearchResultsPage(WebDriver driver){
		this.driver = driver;
	}
	
	//properties(elements/fields on the page)
	By searchResultSummaryContainer = By.cssSelector("div[class='result-summary-container']");
	
	//methods (operations on the fields on the page)
	public boolean verifySearchResultsSummaryExists(WebDriver driver)
	{
		//configure log4j for logging
		Logger log = Logger.getLogger("HomePageTests");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\PageObjectModel\\log4j.properties");
		
		WebDriverWait Wait = new WebDriverWait(driver, 8);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultSummaryContainer));
		if(driver.findElements(searchResultSummaryContainer).size() == 0)
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
