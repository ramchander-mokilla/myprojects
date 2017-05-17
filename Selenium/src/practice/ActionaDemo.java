package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
				
		Actions a = new Actions(driver);
		/*
		WebElement AccountAndLists = driver.findElement(By.xpath(".//*[@id='nav-flyout-accountList']/div[1]/div"));
		a.moveToElement(AccountAndLists).build().perform();
		*/
		WebElement SearchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(SearchTextBox).click().keyDown(Keys.SHIFT).sendKeys("Samsung").build().perform();
		a.moveToElement(SearchTextBox).doubleClick().build().perform();
		a.moveToElement(SearchTextBox).contextClick().build().perform();
		
		//implicit wait statement for Synchronization
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//explicit synchronization 
		//WebDriverWait Wait = new WebDriverWait(driver, 15);
		
	}
	
}
