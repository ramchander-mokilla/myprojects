package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class Global_Parameters {
	
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream filePath = new FileInputStream("C:\\Users\\Mokilla-Win7\\workspace\\TestNG\\src\\testNG\\TestData.properties");
		prop.load(filePath);
		System.out.println("User Name = " +prop.getProperty("username"));
		System.out.println("Password = " +prop.getProperty("password"));
	}	
}