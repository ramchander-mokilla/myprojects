package inheritance;

public class Child extends Parent{
	
	String name = "Ram-Child";
	
	public Child()
	{
		super(); //this will call the parent class constructor
		System.out.println("In Child class constructor");		
	}
	
	public void getData()
	{
		super.getData(); //executes the getData method defined in the parent class
		System.out.println("In getData method in Child class");
		System.out.println(name); //gets name value from this class
		System.out.println(super.name); //gets name value from the parent class
	}

	public static void main(String[] args) {
		
		Child child = new Child();
		child.getAddress();
		child.getOccupation();
		System.out.println("Age = "+child.age);
		child.getData();		
	}

	public void getIncome()
	{
		System.out.println("$23045" );
	}
}
