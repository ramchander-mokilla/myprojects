package threads;

//this is a child class that inherits (and overrides) the run method in Thread class
class WorkerThread extends Thread{
	
	//constructor - used to pass name of the thread as argument when instantiating object of this class
	public WorkerThread(String name) {
		super(name);
	}
	
	@Override
	public void run() //enter run and hit ctrl+space
	{
		for(int i=0; i<20;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("+++++++++ Worker Thread +++++++++++");
		}
	}
}

public class ThreadSleepDemo {

	//main method -> main thread -> will execute the statements in the main method
	public static void main(String[] args){
	
		System.out.println("Main Started");
		
		WorkerThread wt = new WorkerThread("Worker Thread"); 
		
		//sets the priority level to the worker thread to highest level
		wt.setPriority(Thread.MAX_PRIORITY);
		
		//starts the worker thread and executes the statements in run method
		wt.start();
			
		//thread scheduler shares time and memory between the three threads, and run them in parallel
		//this can be gauged by the output seen in the console when running this program
		for(int i=0; i<=20; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("------------ Main Thread ------------");
		}
		
		System.out.println("Main Ended");		
	}
}
