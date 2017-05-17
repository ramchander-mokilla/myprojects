package exceptionhandling;

class Bank{
	int balance = 10000;
	static int count = 0;
	
	void withDraw(int amount) throws Exception
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
			//throwing an unchecked exception
			Exception e = new Exception("Balance is Low");
			throw e;
		}
	}	
}

public class ThrowExceptionDemo1 {

	public static void main(String[] args) throws Exception {
	
		Bank bank = new Bank();
		System.out.println("Banking Started");
		bank.withDraw(2000);
		bank.withDraw(2000);
		bank.withDraw(2000);
		bank.withDraw(2000);
		bank.withDraw(2000);
		bank.withDraw(2000);
		System.out.println("Banking Completed");
	}
}
