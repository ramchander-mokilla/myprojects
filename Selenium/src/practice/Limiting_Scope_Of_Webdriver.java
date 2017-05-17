package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limiting_Scope_Of_Webdriver {

	public static void main(String[] args) throws InterruptedException {

		int iIndex = 0;
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		System.out.println("No.of links on Page = " + driver.findElements(By.tagName("a")).size());
		
		//limiting scope to the footer section
		WebElement FooterSection = driver.findElement(By.cssSelector("div[class='navFooterLine navFooterLinkLine navFooterDescLine']"));
		System.out.println("No.of links on Page = " + FooterSection.findElements(By.tagName("a")).size());
		
		for(int i=0; i<driver.findElements(By.tagName("a")).size(); i++)
		{
			System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
			
			if (driver.findElements(By.tagName("a")).get(i).getText().contains("Amazon Drive"))
			{
				iIndex = i;
			}
		}
		
		driver.findElements(By.tagName("a")).get(iIndex).click();
		
		//Commenting out code to use to click on a particular link, when the location of 
		//the link on the page is not known
		/*	
		for(int i=0; i<driver.findElements(By.tagName("a")).size(); i++)
		{
				
			if (driver.findElements(By.tagName("a")).get(i).getText().contains("Amazon Drive"))
			{
				System.out.println("..........................................");
				System.out.println(driver.getTitle());
				driver.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}	
		*/
		
		System.out.println(driver.getTitle());
		System.out.println(".............DONE......................");
	}	
}
