package collections;

import java.util.HashSet;
import java.util.Iterator;

//Hashset class implements the Set interface
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("Ram");
		hashset.add("Ram"); //duplicates will be removed from the Hashset
		hashset.add("Anish");
		hashset.add("John");
		hashset.add("Doug");
		hashset.add("Bob");
		hashset.add("Ken");
		
		System.out.println("...............");
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("...............");
		
		System.out.println("Size="+hashset.size());
		System.out.println("hashset="+hashset);
		
		System.out.println("Removing John");
		hashset.remove("John");
		System.out.println("Size="+hashset.size());
		System.out.println("hashset="+hashset);
		
		System.out.println("hashset contains element starting with 'R'="+hashset.contains("R"));
		System.out.println("hashset contains element 'Ram'="+hashset.contains("Ram"));
		System.out.println("hashset is empty="+hashset.isEmpty());
		
		System.out.println("Clearing the hashset");
		hashset.clear();
		System.out.println("Size="+hashset.size());
		System.out.println("hashset="+hashset);
		System.out.println("Hashset is empty="+hashset.isEmpty());
		
	}
}
