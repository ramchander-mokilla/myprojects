package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_1 {
	
	@Test
	//TestNG will run the test methods in alphabetical order
	public void TestMethod1()
	{
		System.out.println("In TestMethod 1");
	}
	
	@Test
	public void TestMethod2()
	{
		System.out.println("In TestMethod 2");
	}
	
	@Test
	public void TestMethod3()
	{
		System.out.println("In TestMethod 3");
	}
	
	@BeforeTest
	//this method will run 'once' before 'all' methods
	public void Before_Test()  
	{
		System.out.println("In Before_Test Method");
	}
	
	@BeforeMethod
	//this method will run before 'every' method
	public void Before_Method() 
	{
		System.out.println("In Before_Method Method");
	}
	
	@BeforeSuite
	//this method will be the first to run in the test suite
	public void Before_Suite() 
	{
		System.out.println("In Before_Suite Method");
	}
	
	@AfterTest
	//this method will run 'once' after 'all' methods
	public void After_Test()
	{
		System.out.println("In After_Test Method");
	}
	
	@AfterMethod
	//this method will run after 'every' method
	public void After_Method()
	{
		System.out.println("In After_Method Method");
	}
}