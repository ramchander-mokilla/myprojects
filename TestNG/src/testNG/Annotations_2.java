package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_2 {
	
	@Test(groups={"Priority2"})
	//TestNG will run the test methods in alphabetical order
	public void TestMethod8()
	{
		System.out.println("In TestMethod 8 - Priority 2");
	}
	
	@Test(groups={"Priority2"})
	public void TestMethod9()
	{
		System.out.println("In TestMethod 9 - Priority 2");
	}
	
	//groups example below
	@Test(groups={"Priority1"})
	public void TestMethod10()
	{
		System.out.println("In TestMethod 10 - Priority 1");
	}
	
	//groups example below
	@Test(groups={"Priority1"})
	public void TestMethod11()
	{
		System.out.println("In TestMethod 11 - Priority 1");
	}
	
	@BeforeTest
	//this method will run 'once' before 'all' methods
	public void Before_Test_3()  
	{
		System.out.println("In Before_Test 3 Method");
	}
	
	@BeforeMethod
	//this method will run before 'every' method
	public void Before_Method_3() 
	{
		System.out.println("In Before_Method 3 Method");
	}
	
	@AfterTest
	//this method will run 'once' after 'all' methods
	public void After_Test_3()
	{
		System.out.println("In After_Test 3 Method");
	}
	
	@AfterMethod
	//this method will run after 'every' method
	public void After_Method_3()
	{
		System.out.println("In After_Method 3 Method");
	}
}