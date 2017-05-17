package inheritance;

//class name with final keyword => you cannot extend this class (you cannot inherit from this class)
final class Finalkeyword { 

	//variable with final keyword => constant variable
	final int a = 60;
	
	//method with final keyword => method cannot be overridden
	final void getData()
	{
		int a = 30;
		System.out.println(a); //scope = getData method, this points to the variable defined in this method
		System.out.println(this.a); //scope = class level, this points to the variable defined in the class
	}
	
	public static void main(String[] args) {
		
		Finalkeyword fkw = new Finalkeyword();
		fkw.getData();
	}
}
