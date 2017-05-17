package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book2.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		
		Select AdultDropDown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		AdultDropDown.selectByValue("3");  

		Select ChildDropDown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		ChildDropDown.selectByIndex(4);
		
		Select InfantDropDown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
		InfantDropDown.selectByVisibleText("2");
		
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
	}
}
