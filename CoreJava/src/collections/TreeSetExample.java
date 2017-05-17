package collections;

import java.util.TreeSet;
import java.util.Iterator;

//Treeset class implements the Set interface
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		//treeset gives sorted output
		treeset.add("Ram");
		treeset.add("Ram"); //duplicates will be removed from the treeset
		treeset.add("Anish");
		treeset.add("John");
		treeset.add("Doug");
		treeset.add("Bob");
		treeset.add("Ken");
		
		System.out.println("...............");
		Iterator<String> iterator = treeset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("...............");
		
		System.out.println("Size="+treeset.size());
		System.out.println("treeset= "+treeset);
		
		System.out.println("Removing John");
		treeset.remove("John");
		System.out.println("Size="+treeset.size());
		System.out.println("treeset = "+treeset);
		
		System.out.println("treeset contains element starting with 'R'="+treeset.contains("R"));
		System.out.println("treeset contains element 'Ram'="+treeset.contains("Ram"));
		System.out.println("treeset is empty="+treeset.isEmpty());
		
		System.out.println("Clearing the treeset");
		treeset.clear();
		System.out.println("Size="+treeset.size());
		System.out.println("treeset = "+treeset);
		System.out.println("treeset is empty="+treeset.isEmpty());

		//------------------------------------------------------------------------------------------
		
		TreeSet<Integer> treesetInteger = new TreeSet<Integer>();
		
		//treeset gives sorted output
		treesetInteger.add(123);
		treesetInteger.add(7823); //duplicates will be removed from the treeset
		treesetInteger.add(12);
		treesetInteger.add(983);
		treesetInteger.add(86);
		treesetInteger.add(23);
		treesetInteger.add(82);
		
		System.out.println("...............");
		Iterator<Integer> iterator1 = treesetInteger.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("...............");
		
		System.out.println("Size="+treesetInteger.size());
		System.out.println("treeset = "+treesetInteger);
		
		System.out.println("Clearing the treeset");
		treesetInteger.clear();
		System.out.println("Size="+treesetInteger.size());
		System.out.println("treeset = "+treesetInteger);
		System.out.println("treeset is empty = "+treesetInteger.isEmpty());
		
	}
}
