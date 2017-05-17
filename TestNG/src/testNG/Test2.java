package testNG;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 extends ReusableComponents{
	
	@Test
	public void MyTest() throws IOException
	{
		WebDriver driver = null;
		driver=openApplication(driver);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}	
}