package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTabs2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		
		WebElement LearnMoreLink = driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?p=signin_newlook']"));
		LearnMoreLink.click();		
		
		Thread.sleep(3000);
				
		//code to switch to the child window
		Set<String>WindowIDs=driver.getWindowHandles();
		Iterator<String>It=WindowIDs.iterator();
		
		It.next(); //parent tab id
		System.out.println(driver.getTitle());
		
		String ChildID=It.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		
		//operate on the search text box on the child tab
		driver.findElement(By.cssSelector("input[class='gb_ge']")).sendKeys("RAM");
	}	
}
