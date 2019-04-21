package co.edureka;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();		// Polymorphic Statement
		HashMap<Integer, String> map = new HashMap<Integer, String>();		// Direct Object Construction
		
		// 1. Add data in HashMap
		map.put(101, "John"); // 101, "John" -> Entry Object
		map.put(33, "Jennie");
		map.put(543, "Kia");
		map.put(877, "Fionna");
		map.put(101, "George"); // ReUsing the same key will update previous value
		// Keys are unique, values can be duplicated
		map.put(43, "Fionna");
		
		map.put(null, "Harry"); // we can add 1 null key in map
		map.put(88, null);      // we can have null values for keys as well
		
		// 2. View Data in HashMap
		System.out.println(">> map is: "+map);
		
		// 3. APIs on HashMap
		if(map.containsKey(101)){
			System.out.println("Key 101 is in the map");
		}
		
		if(map.containsValue("Harry")){
			System.out.println("Value Harry is in the map");
		}
		
		System.out.println("HashMap size is: "+map.size());
		
		// 4. Remove Element from Map
		map.remove(101);
		System.out.println(">> map now is: "+map);
		//map.clear(); // remove all
		
		// 5. Retrieve Single Record
		String name = map.get(877);
		System.out.println(">> name is: "+name);
		
		// 6. How we can iterate in HashMap
		Set<Integer> keys = map.keySet(); // Fetch all the keys
		System.out.println(">> keys are: "+keys);
		
		System.out.println();
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(">> Key: "+key+"\tValue: "+value);
		}
		
		System.out.println();
		
		Set<Entry<Integer, String>> entries = map.entrySet(); // return us Entry (Entry is Object with key Value Pair that is inserted in HashMap)
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(">> Key: "+entry.getKey()+"\tValue: "+entry.getValue());
		}
		
		System.out.println();
		
		// Thread-Safe Version i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(101, "John"); // 101, "John" -> Entry Object
		table.put(33, "Jennie");
		table.put(543, "Kia");
		table.put(877, "Fionna");
		table.put(101, "George"); // ReUsing the same key will update previous value
		// Keys are unique, values can be duplicated
		table.put(43, "Fionna");
		
		//table.put(null, "Harry"); // we cannot add null key in Hashtable
		//table.put(88, null);      // we cannot have null values for keys as well
		
		System.out.println(">> table is: "+table);
		
		// TreeMap<K, V> | Sorted Version | Please use in same way and see the output :)

	}

}
