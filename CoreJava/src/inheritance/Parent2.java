package inheritance;
class Parent2 {

	int a;
	static int b;
	
	Parent2()
	{
		a=100;
		b=200;
		System.out.println("Parent's constructor invoked");
	}
	
	void setA(int x)
	{
		a=x;
	}
	
	static void setB(int y)
	{
		b=y;
	}
	
	void showA()
	{
		System.out.println("Value of a is "+a);
	}
	
	static void showB()
	{
		System.out.println("Value of b is "+b);
	}
	
	//this cannot be inherited or accessed outside this class
	@SuppressWarnings("unused")
	private void pvtFunc()
	{
		System.out.println("In Private Function of Parent");
	}
	
	//this will be accessible outside this class if inherited
	//this can be inherited
	protected void protectedFunc()
	{
		System.out.println("In Protected Function of Parent");
	}
	
	public void pubclicFunc()
	{
		System.out.println("In public Function of Parent");
	}
}