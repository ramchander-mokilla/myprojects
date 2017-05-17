package other;
class MyDate{
	
	int dd,mm,yy;
	
	//constructor
	//will be called only once
	//will be the first method to be called after object is created in the Heap memory
	//compiler creates the default constructor, if constructor is not defined in the class
	MyDate()
	{
		dd=25;
		mm=12;
		yy=1993;
	}
	
	//parameterized constructor
	MyDate(int a, int b, int c)
	{
		dd=a;
		mm=b;
		yy=c;
	}
	
	
	void setMyDate()
	{
		dd = 19;
		mm = 10;
		yy = 1994;
	}
	
	void showMyDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		MyDate myDate1 = new MyDate(); //Reference name to the Object
		
		System.out.println(myDate1);
		MyDate myDate2 = myDate1;
		System.out.println(myDate2); //will have the same reference/address as myDate1
		
		myDate1.showMyDate();
		myDate1.setMyDate();
		myDate1.showMyDate();
		
		myDate2.dd = 15;
		myDate2.mm = 11;
		myDate2.yy = 1999;
		
		myDate2.showMyDate(); //shows 15/11/1999
		myDate1.showMyDate(); //this also shows 15/11/1999, because myDate1 and myDate2 reference the same address
		
		MyDate myDate3 = new MyDate(25, 12, 2001); //invoking the parameterized constructor
		myDate3.showMyDate(); 	
		
		//examples of overloaded constructor for Integer class
		Integer iVar1 = new Integer(5);
		Integer iVar2 = new Integer("5");
		
		System.out.println(iVar1);
		System.out.println(iVar2);
		
	}
}
