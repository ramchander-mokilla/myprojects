package exceptionhandling;

public class Exception_Demo {

	int a = 4;
	int b = 7;
	int c = 3; //c=0 will demo divide by zero exception
	
	int arr[] = {10,20,30,40,50};
	
	public void printResult()
	{
		int d = a/c;
		System.out.println(d);
	}
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Exception_Demo ed = new Exception_Demo();
		Exception_Demo ed2 = null; //no Object
		
		//try can have multiple catch blocks
		//try should necessarily be followed by one or more catch block or a finally block
		//when an exception occurs, the underlying statements in the try block will not be executed
		try
		{
			int result = ed.a/ed.c;
			System.out.println("Result= "+result);
			System.out.println("arr[4] = "+ed.arr[4]); //arr[5] will demo Array Index Out of Bound exception 
			ed2.printResult(); //this will demo Null Pointer exception
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Found divide by zero exception");
			System.out.println(ae);
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Found Array Index Out of Bound exception");
			System.out.println(aie);
			System.out.println(aie.getMessage());
			aie.printStackTrace();
		}
		catch (NullPointerException npe)
		{
			System.out.println("Found Null Pointer exception");
			System.out.println(npe);
			System.out.println(npe.getMessage());
			npe.printStackTrace();
		}
		catch (Exception e) //general catch-all exception
		{
			System.out.println("Found exception");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//gets executed 100%, irrespective of whether exception is found/thrown or not
		finally 
		{
			System.out.println("In the Finally block");
		}
		System.out.println("At the end of main method");
		//ed.printResult();
	}
}
