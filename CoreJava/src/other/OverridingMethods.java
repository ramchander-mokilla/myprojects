package other;
class Father{
	public void getBike()
	{
		System.out.println("Hero Splendor");
	}
	static void purchaseBike()
	{
		System.out.println("Hero Passion");
	}
}


class Son extends Father{
	public void getBike()
	{
		//super.getBike(); //points to object of parent class
		System.out.println("Yamaha FZ");
	}
	
	static void purchaseBike()
	{
		System.out.println("KTM Duke 390");
	}
}
public class OverridingMethods {

	public static void main(String[] args) {
	
		Son son = new Son();
		son.getBike();
		Son.purchaseBike();
		Father.purchaseBike();
		
		System.out.println("---------------------------------");
		Father father = new Son();
		father.getBike();
		father = new Father();
		father.getBike();
		System.out.println("---------------------------------");
	}
}