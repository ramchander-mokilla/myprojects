package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C://Selenium//iedriver//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.co.in");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
			
		//driver.close();
		
		driver.quit();
		
	}

}
