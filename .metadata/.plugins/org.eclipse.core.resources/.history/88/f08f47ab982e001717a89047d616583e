package Interface;
//For an abstract class, an object is created at runtime for inheritance, 
//but you (user) cannot create objects of an abstract class

abstract class Shape{
	
	Shape()
	{
		System.out.println("In constructor for Shape class (i.e., creating object for Shape class)");
	}
	
	//abstract methods do not have body (definition)
	//it is mandatory to have this method here, because it is implemented in child classes
	//abstract method can only be there in an abstract class
	abstract void drawShape(); 
}

//Inheritance with IS-A relationship (Circle is a shape..)
class Circle extends Shape{
	void drawShape()
	{
		System.out.println("Drawing a circle\n");
	}
}

class Rectangle extends Shape{
	void drawShape()
	{
		System.out.println("Drawing a rectangle\n");
	}
}

class Diamond extends Shape{
	void drawShape()
	{
		System.out.println("Drawing a diamond\n");
	}
}

//example for run-time polymorphism, using an abstract class (class Shape)
public class AbstractClassDemo {

	public static void main(String[] args) {
	
		//creating reference to object of the parent abstract class
		Shape shape;
		
		//you cannot create objects of abstract class
		//shape = new Shape();
		
		//polymorphic statement
		//Reference of parent class pointing to object of child class
		shape = new Circle(); 
		//Parent's method is marked virtual in this case, and output will be based on the method in child class
		//decision to execute child class method is taken at run-time (run-time polymorphism)
		shape.drawShape(); 	
		
		shape = new Rectangle(); 
		shape.drawShape();
	
		shape = new Diamond(); 
		shape.drawShape();
	}
}