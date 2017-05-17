package exceptionhandling;


//IMP : User defined custom exception
class BankingException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public BankingException(String msg)
	{
		super(msg);
	}
}

class Bank2{
	int balance = 10000;
	static int count = 0;
	
	void withDraw(int amount) throws BankingException
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
			//throwing a custom exception
			BankingException be = new BankingException("Balance is Low");
			throw be;		
		}
	}	
}

public class ThrowExceptionDemo3 {

	public static void main(String[] args){
	
		Bank2 bank = new Bank2();
		System.out.println("Banking Started");
		try {
			bank.withDraw(2000);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withDraw(2000);
		} catch (BankingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Banking Terminated");
		}	
	}
}
