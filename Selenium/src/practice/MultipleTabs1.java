package practice;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTabs1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		
		//get the handle of current window
		String ParentHandle = driver.getWindowHandle();
		
		WebElement LearnMoreLink = driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?p=signin_newlook']"));
		LearnMoreLink.click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		ArrayList<String> Tabs = new ArrayList<String>(driver.getWindowHandles());
	    
		//remove focus from parent tab
		Tabs.remove(ParentHandle);
	    
	    //change focus to new tab
	    driver.switchTo().window(Tabs.get(0));
	    System.out.println(driver.getTitle());
		
	    //Operate on the Search box element in the child tab
	    driver.findElement(By.cssSelector("input[class='gb_ge']")).sendKeys("RAM");
		
	}	
}
