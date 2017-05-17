package collections;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pqInteger = new PriorityQueue<Integer>();
		
		for(int i=1; i<14; i++)
		{
			pqInteger.add(new Integer(i));
		}
		
		for(int i=1; i<14;i++)
		{
			Integer j = pqInteger.poll();
			System.out.println(j);
		}
		System.out.println("--------------------------------------------------------");
		
		//-----------------------------------------------------------------
		PriorityQueue<Boolean> pqBoolean = new PriorityQueue<Boolean>();
		
		for(int i=1; i<14; i++)
		{
			if(i%2==0)
			{
				pqBoolean.add(new Boolean(true));
			}
			else
			{
				pqBoolean.add(new Boolean(false));
			}
		}
		
		for(int i=1; i<14;i++)
		{
			Boolean j = pqBoolean.poll();
			System.out.println(j);
		}
		
		System.out.println("--------------------------------------------------------");
		
		//-----------------------------------------------------------------
		PriorityQueue<String> pqString = new PriorityQueue<String>();
				
		for(int i=1; i<14; i++)
		{
			pqString.add(new String("Hello"));
		}
		
		for(int i=1; i<14;i++)
		{
			String j = pqString.poll();
			System.out.println(j);
		}
				
		System.out.println("--------------------------------------------------------");
	}	
}