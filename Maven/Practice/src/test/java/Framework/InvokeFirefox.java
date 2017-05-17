package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvokeFirefox {

	@Test
	public void RunTest(){
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		WebElement FlightsButton = driver.findElement(By.xpath(".//*[@id='tab-flight-tab-hp']"));
		FlightsButton.click();
		
		WebElement RoundTripButton = driver.findElement(By.xpath(".//*[@id='flight-type-roundtrip-label-hp-flight']"));
		RoundTripButton.click();
		
		WebElement FlyingFromField = driver.findElement(By.xpath(".//*[@id='flight-origin-hp-flight']"));
		FlyingFromField.sendKeys("BWI");
		
		WebElement FlyingToField = driver.findElement(By.xpath(".//*[@id='flight-destination-hp-flight']"));
		FlyingToField.sendKeys("ORD");
		
		WebElement SearchButton = driver.findElement(By.xpath(".//*[@id='gcw-flights-form-hp-flight']/div[7]/label/button"));
		SearchButton.click();
		
		//check whether the alert is present
		if (!driver.findElements(By.xpath(".//*[@id='gcw-flights-form-hp-flight']/div[1]")).isEmpty())
		{
			System.out.println("Alert found as expected");
					
			//check whether the expected error message links are present
			
			Assert.assertEquals(driver.findElement(By.xpath("//a[@href='#flight-departing-hp-flight']")).getText(),
					"Please complete the highlighted departing date field below.",
					"Wrong error message shown");
			
			Assert.assertEquals(driver.findElement(By.xpath("//a[@href='#flight-returning-hp-flight']")).getText(),
					"Please complete the highlighted returning date field below.",
					"Wrong error message shown");
		}
		
		else
		{
			System.out.println("Alert NOT found");
			Assert.fail("Alert NOT found");
		}
		
		//driver.close();
		driver.quit();		
	}
}
