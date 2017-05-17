package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int iCount;
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());

		System.out.println(driver.findElement(By.xpath("//input[@value='Butter']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		Thread.sleep(1500);
		
		iCount = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println("Number of radio buttons in group 1 = " + iCount);
		
		List<WebElement> Group1RadioButtons = driver.findElements(By.xpath("//input[@name='group1']"));
		
		for (int i=0;i<iCount;i++)
		{
			Group1RadioButtons.get(i).click();
			System.out.println("Clicked on " + Group1RadioButtons.get(i).getAttribute("value"));
			Thread.sleep(1500);
		}
		
		List<WebElement> Group2RadioButtons = driver.findElements(By.xpath("//input[@name='group2']"));
		iCount = driver.findElements(By.xpath("//input[@name='group2']")).size();
		System.out.println("Number of radio buttons in group 2 = " + iCount);
		
		for (int i=0;i<iCount;i++)
		{
			Group2RadioButtons.get(i).click();
			System.out.println("Clicked on " + Group2RadioButtons.get(i).getAttribute("value"));
			Thread.sleep(1500);
		}
				
		//driver.close();
		//driver.quit();
	}
}
