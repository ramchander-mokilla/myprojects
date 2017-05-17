package wrapperclasses;


/*Notes:
Each of Java's eight primitive data types has a class dedicated to it. 
These are known as wrapper classes because they "wrap" the primitive data type into an object of that class.
The wrapper classes are part of the java.lang package, which is imported by default into all Java programs 
*/

//below is a generic wrapper class
//Built in wrapper classes in java.lang package are similar to the below class
class MyInteger{
	
	int i;
	
	public MyInteger(int i) 
	{
	
		this.i=i;
	}
	
	void setI(int i)
	{
		this.i=i;
	}
	
	int getI()
	{
		return i;
	}
		
	@Override
	public String toString() {
		return String.valueOf(i);
	}
}

public class WrapperClassDemo{
	
	public static void main(String[] args) {

		int i=10;
		
		//boxing the primitive data type of 'int' into an object of wrapper class
		Integer iRef = new Integer(i); 
	
		//printing the reference variable shall call the toString() method
		//the toString method will print value instead of address
		System.out.println("iRef = "+iRef);
		
		//un-boxing - i.e., getting the value stored in i through a method in wrapper class 
		System.out.println("iRef = "+iRef.intValue()); 
		
		MyInteger mIRef = new MyInteger(i);
		
		//printing the reference variable shall call the toString() method
		//the toString method will print value instead of address
		//the toString method is overriden in the generic wrapper class above so that value is printed instead of address
		System.out.println("mIRef = "+ mIRef); 
		
		System.out.println("mIRef = "+ mIRef.getI());
		
		//auto boxing or implicit way
		Integer anotherRef = i; 
		int k = anotherRef;		
		System.out.println(anotherRef.intValue());
		System.out.println(Integer.valueOf(anotherRef));
		System.out.println(k);
		
		//---------------------------------------------------
		
		Character chRef = new Character('A');
		
		//printing the reference variable shall call the toString() method
		//the toString method will print value instead of address
		System.out.println("chRef = "+chRef);
		
		System.out.println("chRef = "+Character.valueOf(chRef));
		System.out.println("chRef = "+chRef.toString()); //same as System.out.println("chRef = "+chRef);
		System.out.println("chRef = "+chRef.charValue());
		
		//---------------------------------------------------
		String str = new String("Hello");
		
		//printing the reference variable shall call the toString() method
		//the toString method will print value instead of address
		System.out.println(str);
		
		System.out.println(String.valueOf(str));
		System.out.println(str.toString()); //this is actually the same as System.out.println(str)
		
		//---------------------------------------------------
		Boolean bool = new Boolean(true);
		
		//printing the reference variable shall call the toString() method
		//the toString method will print value instead of address
		System.out.println(bool);
		
		System.out.println(Boolean.valueOf(bool));
		System.out.println(bool.toString()); //
		System.out.println(bool.booleanValue());
	}	
}
