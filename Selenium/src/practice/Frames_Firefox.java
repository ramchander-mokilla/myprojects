package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Firefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		//Obtain frame element locator by inspecting and spying the element
		//the element is characterized by 'iframe' tag
		
		WebElement DragNDropFrame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(DragNDropFrame);
		driver.findElement(By.id("draggable")).click();
		
		Actions FrameActions = new Actions(driver);
		WebElement DraggableSource = driver.findElement(By.id("draggable"));
		WebElement TargetToDrop = driver.findElement(By.id("droppable"));
		
		//with methods in Actions class, we must use .build().perform()
		FrameActions.dragAndDrop(DraggableSource, TargetToDrop).build().perform();
		
		driver.switchTo().defaultContent();
	}	
}
