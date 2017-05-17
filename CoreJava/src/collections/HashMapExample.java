package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//Hashmap implements Map interface
//Hashmap is not synchronized and thread safe 
public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap1 = new HashMap<Integer, String>();
		
		hashmap1.put(0, "John");
		hashmap1.put(1, "Jack");
		hashmap1.put(2, "Doug");
		hashmap1.put(3, "Ken");
		
		System.out.println("..................");
		System.out.println(hashmap1.get(0));
		System.out.println(hashmap1.get(1));
		System.out.println(hashmap1.get(2));
		System.out.println(hashmap1.get(3));
		System.out.println("..................");
		
		Set<Entry<Integer, String>> hashmapset = hashmap1.entrySet();
		Iterator<?> setIterator = hashmapset.iterator();
		while(setIterator.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry mapEntry = (Map.Entry)setIterator.next(); 
			System.out.println(mapEntry);
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());
			System.out.println("\n");
		}
		
		
		HashMap<String,String> hashmap2 = new HashMap<String, String>();
		
		hashmap2.put("User 1", "John");
		hashmap2.put("User 2", "Jack");
		hashmap2.put("User 3", "Doug");
		hashmap2.put("User 4", "Ken");
		
		System.out.println("..................");
		System.out.println(hashmap1.get(0));
		System.out.println(hashmap1.get(1));
		System.out.println(hashmap1.get(2));
		System.out.println(hashmap1.get(3));
		
		System.out.println(hashmap2.get("User 1"));
		System.out.println(hashmap2.get("User 2"));
		System.out.println(hashmap2.get("User 3"));
		System.out.println(hashmap2.get("User 4"));
		
	}
}