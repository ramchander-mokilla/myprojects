package other;
class Counter{
	
	//non-static member is part/property of Object
	int count;
	
	//static member is NOT part/property of Object, and belongs to the class only
	//however, Objects of this class can access this member
	//will reside in memory until the class exists
	static int scount;
	
	Counter()
	{
		count = 1;
		scount = 1;
	}
	
	void incrementCount()
	{
		count = count+1;
		scount = scount+1;
	}
	
	//static method cannot access non static members (members that are part of the Object)
	static void staticCount()
	{
		scount = 99;
	}

	
	void showCount()
	{
		System.out.println("Count = "+count);
		System.out.println("SCount = "+scount);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
	
		Counter c1 = new Counter(); //c1 : count=1; scount = 1
		Counter c2 = new Counter(); //c2 : count=1; scount = 1
		
		c1.incrementCount(); //c1 : count=2; scount = 2
		c1.incrementCount(); //c1 : count=3; scount = 3
		c1.incrementCount(); //c1 : count=4; scount = 4
		c2.incrementCount(); //c2 : count=2; scount = 5
		c2.incrementCount(); //c2 : count=3; scount = 6
		c2.incrementCount(); //c2 : count=4; scount = 7
		c1.showCount(); //4,7
		c2.showCount(); //4,7
		
		Counter.scount = 50;
		c1.showCount(); //4,50
		c2.showCount(); //4,50
		
		Counter.staticCount();
		c1.showCount(); //4,99
		c2.showCount(); //4,99
	}
}
