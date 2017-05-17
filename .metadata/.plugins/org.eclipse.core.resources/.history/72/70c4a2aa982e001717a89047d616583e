package inheritance;

import inheritance.Parent2;

class Child2 extends Parent2{
	
	Child2() //constructors are not inherited
	{
		a=1000;
		b=2000;
		System.out.println("Child's constructor invoked");
	}
}	
	
public class Inheritance {
	public static void main(String[] args) {

		Child2 cRef = new Child2(); //first creates the object of parent and then that of child
		
		cRef.showA();
		Child2.showB();
		
		cRef.setA(16);
		cRef.showA();	
		
		Child2.setB(8);
		Child2.showB();
		
		cRef.protectedFunc();
		cRef.pubclicFunc();
		
	}
}
