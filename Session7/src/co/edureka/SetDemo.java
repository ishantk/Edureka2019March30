package co.edureka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jennie");
		list.add("Jim");
		list.add("John");
		list.add("Jack");
		list.add("Jack");
		list.add("Joe");
		
		System.out.println(">> list is: "+list);
		System.out.println(">> size of list is: "+list.size());
		
		// Set will add data not on indexes but as in tree !!
		// Set will store data using Hashing so we cannot access individual element of a Set as we don't have indexes here
		// Further, Set will not add duplicates. It focuses on uniqueness !!
		// We see unordered data sue to hashing !!
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();	// Sort the data as well
		
		set.add("John");
		set.add("Jennie");
		set.add("Jim");
		set.add("John");
		set.add("Jack");
		set.add("Jack");
		set.add("Joe");
		set.add("Adam");
		set.add("Fionna");
		
		System.out.println(">> set is: "+set);
		System.out.println(">> size of set is: "+set.size());
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(">> name is: "+name);
		}
		
		set.remove("John");
		System.out.println(">> set now is: "+set);
		
		if(set.contains("Jack")){
			System.out.println(">> Jack is in the set");
		}
			
		
	}

}
