package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		//get id of the frame that contains element referenced by the given CSS locator
		int iFrameNumber = findFrameNumber(driver, By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		driver.switchTo().frame(iFrameNumber);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		
		driver.switchTo().defaultContent();
		
		iFrameNumber = findFrameNumber(driver, By.xpath("//button[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(iFrameNumber);
		driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")).click();
		
		driver.switchTo().defaultContent();
	}

	public static int findFrameNumber(WebDriver driver, By by)
	{
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		
		for (i=0; i<frameCount; i++)
		{
			driver.switchTo().frame(i);
			
			if(driver.findElements(by).size() > 0)
			{
				break;
			}
		}
			
		driver.switchTo().defaultContent();
		return i;
	}	
}