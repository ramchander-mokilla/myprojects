
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testDropdown {

	@Test
	public static void validateDropDowns() {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger("Log4j_Class_1");
		PropertyConfigurator.configure("C:\\Users\\Mokilla-Win7\\workspace\\Log4j\\log4j.properties");
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book2.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		log.debug("Spicejet site is opened");
		
		log.debug("Selecting Adult Dropdown List");
		Select AdultDropDown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		AdultDropDown.selectByValue("3");  

		log.debug("Selecting Child Dropdown List");
		Select ChildDropDown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		ChildDropDown.selectByIndex(4);
		
		log.debug("Selecting Infant Dropdown List");
		Select InfantDropDown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
		InfantDropDown.selectByVisibleText("2");
		
		log.debug("Selecting Origin & Destination Stations");
		WebElement OriginStation=driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']"));
		OriginStation.click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		/*
		WebElement DestinationStation=driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']"));
		DestinationStation.click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		*/
		
		//driver.close();
		driver.quit();
		log.debug("Browser instance closed");
		
	}
}
