package other;

public class Basics1 {

	int a = 50;
	
	public static void ClassExample()
	{
		System.out.println("RAM IN CLASS");
		
	}

	public static String ReturnString()
	{
		
		return "'In returnString method'";
		
	}
	
	public static void Method()
	{
		System.out.println("In Method");
	}
	
	public static void main(String[] args)
	{
		int a = 40;		
		ClassExample();
		System.out.println(ReturnString());
		Method();
		Basics2 b = new Basics2();
		int c=a*b.a;
		System.out.println(c);
	}
}
