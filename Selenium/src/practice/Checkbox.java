package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://book2.spicejet.com/");
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).isSelected());
		driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).click();
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).isSelected());

		System.out.println(driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']")).isEnabled());
		driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.cssSelector("[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).click();

		
		//driver.close();
		//driver.quit();
	}
}
