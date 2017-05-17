package testNG;

import org.testng.annotations.Test;

public class DependencyAnnotations {
	
	@Test(dependsOnMethods={"TestMethod5"})
	//This test will only run after TestMethod5 is run successfully
	public void TestMethod4()
	{
		System.out.println("In TestMethod 4");
	}
	
	@Test(timeOut=5000)
	//If execution is not completed in 5 seconds, 
	//then the test will be marked fail
	public void TestMethod5()
	{
		System.out.println("In TestMethod 5");
	}
	
	@Test(dependsOnMethods={"TestMethod4"},alwaysRun=true)
	//This test will only run after TestMethod4, 
	//regardless of whether TestMethod4 is successful or not
	public void TestMethod6()
	{
		System.out.println("In TestMethod 6");
	}	
	
	@Test(enabled=false)
	//This test will NOT run
	public void TestMethod7()
	{
		System.out.println("In TestMethod 7");
	}
}
