package exceptionhandling;

import java.io.IOException;

class Bank1{
	int balance = 10000;
	static int count = 0;
	
	void withDraw(int amount) throws IOException
	{
		balance = balance-amount;
		if (balance<4000)
		{
			System.out.println("Withdrawl Failed. Insufficient balance - "+count);
			count++;
		}
		else
		{
			System.out.println("Withdrawl success. Balance = "+balance);
		}
		
		if(count==3)
		{
			//throwing a checked exception (from java.io, and not a child of RunTimeException)
			IOException ioe = new IOException("Balance is Low");
			throw ioe;		
		}
	}	
}

public class ThrowExceptionDemo2 {

	public static void main(String[] args){
	
		Bank1 bank = new Bank1();
		System.out.println("Banking Started");
		try {
			bank.withDraw(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Banking Completed");
		}	
	}
}
