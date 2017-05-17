package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Vector is similar to ArrayList
//Vector is synchronized and Thread safe

public class VectorExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//One more way of defining ArrayList
		//List<String> vector = new Vector<String>();
		
		//Note: Primitive data types cannot be stored in ArrayList
		//Below statement is invalid
		//List<int> list = new Vector<int>();
		
		Vector<String> vector1 = new Vector<String>();
		//Below statement is valid, as:
		//A. List interface contains Vector interface
		//B. Integer is a wrapper class for primitive data type of int
		Vector<Integer>vector2 = new Vector<Integer>();
		@SuppressWarnings("rawtypes")
		Vector vector3 = new Vector(); //Raw type - list can contain items of any type
		Vector<Boolean>vector4 = new Vector<Boolean>();
		
		//operations on list1
		vector1.add("Anish");
		vector1.add("Ram");
		vector1.add(1, "John");
		vector1.remove(2);
		vector1.add("Test");
		vector1.add("Ram");
		vector1.add("Ram"); //Vector can contain duplicate data
		vector1.add("Bill");
		vector1.add(new String("Evan"));
		//to display contents of vector1
		//Iterator is an interface used to traverse Vector in forward direction
		Iterator<String> iterator1 = vector1.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of vector 1:");
		System.out.println(iterator1.next());
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("...................................................................");
		System.out.println("vector 1 size = "+vector1.size());
		
		//another means of displaying contents list1
		for (int i=0; i<vector1.size(); i++)
		{
			System.out.println(vector1.get(i));
		}
		System.out.println("...................................................................");
		
		//yet another means of traversing through list1
		Enumeration<String> enumlist1 = Collections.enumeration(vector1);
		while(enumlist1.hasMoreElements())
		{
			System.out.println(enumlist1.nextElement());
		}
		System.out.println("...................................................................");
		System.out.println("Index of 'Ram' in list 1 = " + vector1.indexOf("Ram"));
		System.out.println("List1 contains 'Test' = "+vector1.contains("Test"));
		System.out.println("List1 contains 'Testt' = "+vector1.contains("Testt"));
		System.out.println("Index of 'John' in list1 = "+vector1.indexOf("John"));
		System.out.println("list1 is empty? "+vector1.isEmpty());
		//remove all elements in vector1
		System.out.println("Clearing contents in vector1..");
		vector1.removeAll(vector1);
		System.out.println("Now vector 1 is: "+vector1);
		
		//----------------------------------------------------------------------------------		
		//operations on vector2
		vector2.add(10); // this statement is translated to vector2.add(new Integer(10)); 
		vector2.add(new Integer(19));
		vector2.add(34);
		//to display contents of vector2
		Iterator<Integer> iterator2 = vector2.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 2:");
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next()+" ");
		}
		System.out.println("...................................................................");
		System.out.println("list 2 size = "+vector2.size());
		//another means of displaying contents vector2
		for (Integer i : vector2)
		{
			System.out.println(i);
		}
		
		//yet another means of traversing through vector2
		Enumeration<Integer> enumvector2 = Collections.enumeration(vector2);
		while(enumvector2.hasMoreElements())
		{
			System.out.println(enumvector2.nextElement());
		}
		System.out.println("...................................................................");
				
		
		//----------------------------------------------------------------------------------
		vector3.add(101); // this statement is translated to vector3.add(new Integer(101)); 
		vector3.add(new Integer(199));
		vector3.add("String in raw type list");
		vector3.add(true);
		vector3.add(4.99);
		vector3.add('W');
		
		//to display contents of vector3
		Iterator<Integer> iterator3 = vector3.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 3:");
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next()+" ");
		}
		System.out.println("...................................................................");
		System.out.println("list 3 size = "+vector3.size());
		//another means of displaying contents of vector3
		for (int i=0; i<vector3.size(); i++)
		{
			System.out.println(vector3.get(i));
		}
		System.out.println("...................................................................");

		//yet another means of traversing through vector3
		Enumeration<Object> enumvector3 = Collections.enumeration(vector3);
		while(enumvector3.hasMoreElements())
		{
			System.out.println(enumvector3.nextElement());
		}
		System.out.println("...................................................................");
				
		//clone vector3
		System.out.println("Cloning list 3 into Object O..");
		System.out.println("Contents of cloned object:");
		Object o = vector3.clone();
		System.out.println(o.toString());
		System.out.println(o); //same as above statement
		
		//----------------------------------------------------------------------------------
		vector4.add(true);  
		vector4.add(new Boolean(false));
		vector4.add(true);
		vector4.add(true);
		vector4.add(false);
		vector4.add(true);
				
		//to display contents of vector4
		Iterator<Boolean> iterator4 = vector4.iterator();
		System.out.println("...................................................................");
		System.out.println("Contents of list 4:");
		while(iterator4.hasNext())
		{
			System.out.println(iterator4.next()+" ");
		}
		System.out.println("...................................................................");
		System.out.println("list 4 size = "+vector4.size());
		//another means of displaying contents of vector4
		for (int i=0; i<vector4.size(); i++)
		{
			System.out.println(vector4.get(i));
		}
		System.out.println("...................................................................");
		
		//another means of displaying contents of vector4
		for (Boolean b: vector4)
		{
			System.out.println(b);
		}
		System.out.println("...................................................................");

		//yet another means of traversing through vector4
		Enumeration<Boolean> enumvector4 = Collections.enumeration(vector4);
		while(enumvector4.hasMoreElements())
		{
			System.out.println(enumvector4.nextElement());
		}
		System.out.println("...................................................................");
	
	}
}
