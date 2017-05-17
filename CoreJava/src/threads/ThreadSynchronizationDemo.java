package threads;

class Table{
	
	//keyword 'synchronized'will enable running this method synchronously in different threads
	synchronized void printTable(int num) 
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(num + " "+i+"'s are " +(num*i));
		}
	}
}

class Thread1 extends Thread{
	
	Table t;
	
	Thread1(Table s)
	{
		t=s;
	}
	
	@Override
	public void run() {
		t.printTable(5);
	}
}

class Thread2 extends Thread{
	
	Table t;
	
	Thread2(Table s)
	{
		t=s;
	}
	
	@Override
	public void run() {
		t.printTable(8);
	}
}

public class ThreadSynchronizationDemo{
	
	public static void main(String[] args) {
		
		Table t = new Table();
		
		Thread1 thread1 = new Thread1(t);
		Thread2 thread2 = new Thread2(t);
		
		thread1.start(); //this thread will secure mutex lock on the printTable method until it is done
		thread2.start(); //this thread will secure mutex lock on the printTable method after thread 1 is done		
	}
	
}
