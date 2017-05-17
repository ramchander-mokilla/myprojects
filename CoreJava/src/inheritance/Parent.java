package inheritance;

public class Parent {

	public Parent()
	{
		System.out.println("In Parent class constructor");
	}

	public static void main(String[] args) {
		
			
	}

	int age = 60;
	
	String name = "Ram-Parent";
	
	public void getData()
	{
		System.out.println("In getData method in Parent class");
		System.out.println(name);
	}
	
	public void getAddress()
	{
		System.out.println("Hyderabad, India");
	}
	
	public void getOccupation()
	{
		System.out.println("Farmer");
	}
}
