package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTest_2 {
	
	@Test(enabled=false)
	@Parameters({"UserID", "Grade"}) 
	//Values defined in Parameters.xml.Test needs to be run from Parameters.xml
	public void displayStudentProfile(String userID, String grade)
	{
		System.out.println("Student ID = " +userID);
		System.out.println("Grade = " +grade);
	}	
}