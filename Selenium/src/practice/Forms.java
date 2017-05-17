package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forms {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//label[@for='switch__input_1']")).click();
		System.out.println("Visibility of Return field after clicking the One Way button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
				
		driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
		System.out.println("Visibility of Return field after clicking the Round Trip button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
				
		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
		System.out.println("Visibility of Return field after clicking the Multi City button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		
	}
}