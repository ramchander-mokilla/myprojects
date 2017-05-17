package practice;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			// Copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(screenShotFile,new File("C:/Selenium/screenshot.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	
		System.out.println("DONE!!");
		driver.close();
	}
}
	