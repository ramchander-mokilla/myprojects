package other;

/* Why use Inner class? 
 * a. For logical groupings of classes that are only used in one place (when a class is only useful to one other class)
 * b. To increase encapsulation. When class B needs access to members and methods of class B which would otherwise be private
 * c. Enhances code readability and maintainability
 */

class Outer{
	
	class Inner{
		
		void test()
		{
			System.out.println("In the inner class");
		}
	}
}


public class InnerClasses {

	public static void main(String[] args) {
	
		Outer outerclass = new Outer();
		
		Outer.Inner innerclass = outerclass.new Inner();
		
		innerclass.test();
		
	}
}