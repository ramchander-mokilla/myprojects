package Interface;

//class Rect implements the methods declared in interface Area and interface Fun
class Rect implements Area,Fun{
	int area;
	public void calculateArea() //should be defined as public
	{
		int l=10;
		int b=20;
		area = l*b;
		//value of i cannot be changed, as it is declared in the Area interface and is final by default
		//i=23; 
	}
	public void showArea()
	{
		System.out.println("Area of Rectangle = "+area);
	}
	public void fun()
	{
		System.out.println("Now in fun method in Rect class");
	}
}

class Square implements Area{
	int area;
	public void calculateArea()
	{
		int s=10;
		area = s*s;
	}
	public void showArea()
	{
		System.out.println("Area of Square = "+area);
	}	
}

class AreaOfCircle implements AreaAndFun{
	double area;
	public void calculateArea() //should be defined as public
	{
		int r=10;
		area = 3.14*r*r;
	}
	public void showArea()
	{
		System.out.println("Area of circle = "+area);
	}
	public void fun()
	{
		System.out.println("Now in fun method in circle class");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		//run-time Polymorphism.
		//this is identical to WebDriver implementation in Selenium (WebDriver driver = new FirefoxDriver();)
		//Here Area1 is reference to the object of Rect class
		Area Area1 = new Rect();  
		Area1.calculateArea();
		Area1.showArea();
		//with interface, you can only access methods declared in the interface and implemented in the class
		//Area1.fun(); --> fun method is declared in the Fun interface and not Area interface
		Fun fun1 = new Rect();
		fun1.fun();
		//fun1.calculateArea(); --> calculateArea method is declared in the Area interface and not Fun interface
		//fun1.showArea() --> showArea method is declared in the Area interface and not Fun interface
		
		Area Area2 = new Square();
		Area2.calculateArea();
		Area2.showArea();
		
		//cannot create classes for interfaces
		//Area Area3 = new Area(); --> invalid statement
		
		AreaOfCircle AreaOfCircle1 = new AreaOfCircle();  
		AreaOfCircle1.calculateArea();
		AreaOfCircle1.showArea();
		AreaOfCircle1.fun();
	}
}
