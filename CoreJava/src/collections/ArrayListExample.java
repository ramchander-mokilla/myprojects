package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

//ArrayList class implements List interface
//ArrayList is not synchronized and Thread safe

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//One more way of defining ArrayList
		//List<String> list = new ArrayList<String>();
		
		//Note: Primitive data types cannot be stored in ArrayList
		//Below statement is invalid
		//List<int> list = new ArrayList<int>();
		
		ArrayList<String> list1 = new ArrayList<String>();
		//Below statement is valid, as:
		//A. List interface contains ArrayList interface
		//B. Integer is a wrapper class for primitive data type of int
		List<Integer>list2 = new ArrayList<Integer>();
		@SuppressWarnings("rawtypes")
		ArrayList list3 = new ArrayList(); //Raw type - list can contain items of any type
		List<Boolean>list4 = new ArrayList<Boolean>();
		
		//operations on list1
		list1.add("Anish");
		list1.add("Ram");
		list1.add(1, "John");
		list1.remove(2);
		list1.add("Test");
		list1.add("Ram");
		list1.add("Ram"); //arraylist can contain duplicate data
		list1.add("Bill");
		list1.add(new String("Evan"));
		//to display contents of list1
		//Iterator is an interface used to traverse arraylist in forward direction
		Iterator<String> iterator1 = list1.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 1:");
		System.out.println(iterator1.next());
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("...................................................................");
		System.out.println("list 1 size = "+list1.size());
		
		//another means of displaying contents list1
		for (int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("...................................................................");
		
		//yet another means of traversing through list1
		Enumeration<String> enumlist1 = Collections.enumeration(list1);
		while(enumlist1.hasMoreElements())
		{
			System.out.println(enumlist1.nextElement());
		}
		System.out.println("...................................................................");
		System.out.println("Index of 'Ram' in list 1 = " + list1.indexOf("Ram"));
		System.out.println("List1 contains 'Test' = "+list1.contains("Test"));
		System.out.println("List1 contains 'Testt' = "+list1.contains("Testt"));
		System.out.println("Index of 'John' in list1 = "+list1.indexOf("John"));
		System.out.println("list1 is empty? "+list1.isEmpty());
		//remove all elements in list1
		System.out.println("Clearing contents in list1..");
		list1.removeAll(list1);
		System.out.println("Now list 1 is: "+list1);
		
		//----------------------------------------------------------------------------------		
		//operations on list2
		list2.add(10); // this statement is translated to list2.add(new Integer(10)); 
		list2.add(new Integer(19));
		list2.add(34);
		//to display contents of list2
		Iterator<Integer> iterator2 = list2.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 2:");
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next()+" ");
		}
		System.out.println("...................................................................");
		System.out.println("list 2 size = "+list2.size());
		//another means of displaying contents list2
		for (Integer i : list2)
		{
			System.out.println(i);
		}
		
		//yet another means of traversing through list2
		Enumeration<Integer> enumlist2 = Collections.enumeration(list2);
		while(enumlist2.hasMoreElements())
		{
			System.out.println(enumlist2.nextElement());
		}
		System.out.println("...................................................................");
				
		
		//----------------------------------------------------------------------------------
		list3.add(101); // this statement is translated to list3.add(new Integer(101)); 
		list3.add(new Integer(199));
		list3.add("String in raw type list");
		list3.add(true);
		list3.add(4.99);
		list3.add('W');
		
		//to display contents of list3
		Iterator<Integer> iterator3 = list3.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 3:");
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next()+" ");
		}
		System.out.println("...................................................................");
		System.out.println("list 3 size = "+list3.size());
		//another means of displaying contents of list3
		for (int i=0; i<list3.size(); i++)
		{
			System.out.println(list3.get(i));
		}
		System.out.println("...................................................................");

		//yet another means of traversing through list3
		Enumeration<Object> enumlist3 = Collections.enumeration(list3);
		while(enumlist3.hasMoreElements())
		{
			System.out.println(enumlist3.nextElement());
		}
		System.out.println("...................................................................");
				
		//clone list3
		System.out.println("Cloning list 3 into Object O..");
		System.out.println("Contents of cloned object:");
		Object o = list3.clone();
		System.out.println(o.toString());
		System.out.println(o); //same as above statement
		
		//----------------------------------------------------------------------------------
		list4.add(true);  
		list4.add(new Boolean(false));
		list4.add(true);
		list4.add(true);
		list4.add(false);
		list4.add(true);
				
		//to display contents of list4
		Iterator<Boolean> iterator4 = list4.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 4:");
		while(iterator4.hasNext())
		{
			System.out.println(iterator4.next()+" ");
		}
		System.out.println("...................................................................");
		System.out.println("list 4 size = "+list4.size());
		//another means of displaying contents of list3
		for (int i=0; i<list4.size(); i++)
		{
			System.out.println(list4.get(i));
		}
		System.out.println("...................................................................");
		
		//another means of displaying contents of list4
		for (Boolean b: list4)
		{
			System.out.println(b);
		}
		System.out.println("...................................................................");

		//yet another means of traversing through list4
		Enumeration<Boolean> enumlist4 = Collections.enumeration(list4);
		while(enumlist4.hasMoreElements())
		{
			System.out.println(enumlist4.nextElement());
		}
		System.out.println("...................................................................");
	
	}
}
