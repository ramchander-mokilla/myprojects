package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.alaskaair.com/");
		
		//implicit wait statement for Synchronization
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		WebElement HotelsTab = driver.findElement(By.xpath("//a[@id='tab-hotels']"));
		HotelsTab.click();
		
		WebElement HotelLocation = driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']"));
		HotelLocation.sendKeys("NYC");
		driver.findElement(By.xpath("//li[@citycode='6139058']")).click();
		//HotelLocation.sendKeys(Keys.ENTER);
		//HotelLocation.sendKeys(Keys.TAB);

		WebElement FindHotelButton = driver.findElement(By.xpath("//button[@id='FindHotels']"));
		FindHotelButton.click();
		
		//explicit synchronization for search results
		WebDriverWait Wait = new WebDriverWait(driver, 15);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='129325']/div[2]/div[1]/a")));
		//click on the first search result
		driver.findElement(By.xpath(".//*[@id='129325']/div[2]/div[1]/a")).click();
		
	}
	
}
