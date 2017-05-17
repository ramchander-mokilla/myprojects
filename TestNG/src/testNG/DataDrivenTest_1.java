package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest_1 {
	
	@Test(dataProvider="provideTestData")
	public void displayStudentProfile(String studentName, String marks, String grade)
	{
		System.out.println("Student=" +studentName+ "; Marks=" +marks+ "; Grade=" +grade);
	} 
	
	@DataProvider
	public String[][] provideTestData()
	{
		//row number = number of times the test should run
		//column number = number of parameterized test data items
		String[][] data = new String[3][3]; 
				
		data[0][0] = "John";
		data[0][1] = "78";
		data[0][2] = "A";
		
		data[1][0] = "Rick";
		data[1][1] = "58";
		data[1][2] = "B";
		
		data[2][0] = "Kelly";
		data[2][1] = "89";
		data[2][2] = "A+";
		
		return data;
	}		
}