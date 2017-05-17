package threads;

//this is a child class that inherits (and overrides) the run method in Thread class
class MyFirstThread extends Thread{
	
	//constructor - used to pass name of the thread as argument when instantiating object of this class
	public MyFirstThread(String name) {
		super(name);
	}
	
	@Override
	public void run() //enter run and hit ctrl+space
	{
		for(int i=0; i<20;i++)
		{
			System.out.println("+++++++++ My First Thread +++++++++++");
		}
	}
}

//this is a child class that inherits (and overrides) the run method in Thread class
class MySecondThread extends Thread{
	@Override
	public void run() 
	{
		for(int i=0; i<20;i++)
		{
			System.out.println("*********** My Second Thread **********");
		}
	}
}

//this class implements the run method in Runnable interface
class MyThirdThread implements Runnable{
	@Override
	public void run() 
	{
		for(int i=0; i<20;i++)
		{
			System.out.println("########### My Third Thread ##########");
		}
	}
}

public class ThreadDemo {

	//main method -> main thread -> will execute the statements in the main method
	public static void main(String[] args){
	
		System.out.println("Main Started");
		
		MyFirstThread mft = new MyFirstThread("My First Thread"); //sets name of thread to "My First Thread"
																  //see constructor definition for this class above
		MySecondThread mst = new MySecondThread();
		mst.setName("My Second Thread"); //another way to set the name of the thread
		
		Runnable r = new MyThirdThread(); //polymorphic statement
		Thread mtt = new Thread(r);
		mtt.setName("My Third Thread");
		
		//starts the worker threads and executes the statements in the respective run methods in the child classes
		mft.start();
		mst.start();
		mtt.start(); 
		
		//thread scheduler shares time and memory between the three threads, and run them in parallel
		//this can be gauged by the output seen in the console when running this program
		for(int i=0; i<=20; i++)
		{
			System.out.println("------Main Thread ---------");
		}
		
		System.out.println("My First Thread Name = "+mft.getName());
		System.out.println("My Second Thread Name = "+mst.getName());
		System.out.println("My Third Thread Name = "+mtt.getName());
		System.out.println("Main Thread Name = "+Thread.currentThread().getName());
		
		System.out.println("Main Ended");
		
	}
}
