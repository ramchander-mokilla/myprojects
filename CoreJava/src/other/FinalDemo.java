package other;

class A{
	
	final void fun()
	{
		System.out.println("In Class A");
	}
	
}

class B extends A{
	
	//overriding fun method
	//not possible if fun method is declared as final in the parent class
	/*
	void fun()
	{
		System.out.println("In Class B");
	}
	*/
}

public class FinalDemo {
	
	//this block is called when the class is loaded into memory
	//this will be called before main, as main and static block are defined in the same class
	static{
		System.out.println("In Static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("In main method");
		
		int i = 10;
		i=i+1;
		
		i=100;
		
		final int j = 25;
		System.out.println(j);
		//value of j cannot be changed as it is defined as final
		//j=34;
		
		//value of k cannot be changed after initial assignment, as it is defined as final
		final int k;
		k=230;
		//k=213;
		System.out.println(k);
		
	}

}
