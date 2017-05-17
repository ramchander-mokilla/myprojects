package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver = null;
	
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream filePath = new FileInputStream("C:\\Users\\Mokilla-Win7\\workspace\\TestNG\\src\\testNG\\TestData.properties");
		prop.load(filePath);
		
		if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (prop.getProperty("browser").equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C://Selenium//iedriver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Sorry, Test Script does not support " +prop.getProperty("browser")+ " at this time");
			return;
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}	
}