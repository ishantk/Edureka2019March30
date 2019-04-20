package co.edureka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	
	String name;
	int salary;
	
	void showEmployee(){
		System.out.println("Name:"+name+"  Salary:"+salary);
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		// Hetrogeneous ArrayList Creation : We can add any type of data/Objects !!
		ArrayList list1 = new ArrayList();

		// Homogeneous ArrayList Creation
		// We can add only String Objects
		ArrayList<String> list2 = new ArrayList<String>();
		// We can add only Employee Objects
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		// Polymorphic Statement:
		// List<String> list4 = new ArrayList<String>();
		
		Employee e1 = new Employee();
		e1.name = "Leo";
		e1.salary = 30000;
		
		Employee e2 = new Employee();
		e2.name = "George";
		e2.salary = 50000;
		
		
		// == 1. Add Data to List ==
		list1.add(10);		//0			// list1.add(10); -> list1.add(new Integer(10)); // Boxing will happen in the background
		list1.add(33.45);	//1
		list1.add("John");	//2
		list1.add("Mike");	//3
		list1.add('A');		//4
		list1.add(e1);		//5
		
		//list2.add(0,"John");
		list2.add("John");	//0
		list2.add("Jennie");//1
		list2.add("Jim");	//2
		list2.add("Jack");	//3
		list2.add("Joe");	//4
		//list2.add('A');		// error
		
		list3.add(e1);		//0
		list3.add(e2);		//1
		//list3.add('A');		// error
		
		System.out.println();
		
		// == 2. View Data in List ==
		// The way we added the way it will be displayed
		System.out.println("===list1===");
		System.out.println(list1);
		
		System.out.println("===list2===");
		System.out.println(list2);
		
		System.out.println("===list3===");
		System.out.println(list3);
		
		System.out.println();
		
		// == 3. View Single element in List ==
		// Object : RTP i.e. Parent can point to any child object
		Object o = list1.get(0); // Object in Java is Parent to any class which is built in or which we create
		String s = list2.get(1);
		Employee e = list3.get(0);
		
		System.out.println(o);
		System.out.println(s);
		e.showEmployee();
		
		// == 4. Getting the size of list ==
		System.out.println(">> list1 size is: "+list1.size());
		System.out.println(">> list2 size is: "+list2.size());
		System.out.println(">> list3 size is: "+list3.size());
		
		System.out.println();
		
		// == 5. Update Data in list ==
		list1.set(0, 333);
		list2.set(1, "Fionna");
		Employee e3 = new Employee();
		e3.name = "Kia";
		e3.salary = 70000;
		list3.set(1, e3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println();
		
		// == 6. Remove Data from list ==
		//list1.remove(3); // index management will happen automatically
		//list2.remove(1);
		//list3.remove(1);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		// Lets see some APIs on ArrayList
		int idx = list2.indexOf("Jack");
		System.out.println("idx is: "+idx);
		
		if(list2.contains("Jack")){
			System.out.println(">> Jack is in the list");
		}
		
		// == 7. Iterate in ArrayList ==
		
		System.out.println(">> For Loop");
		// 7.1 Using For Loop
		System.out.println();
		
		for(int i=0;i<list1.size();i++){
			Object o1 = list1.get(i);
			System.out.println(o1);
		}
		System.out.println();
		for(int i=0;i<list2.size();i++){
			String s1 = list2.get(i);
			System.out.println(s1);
		}
		System.out.println();
		for(int i=0;i<list3.size();i++){
			Employee eRef = list3.get(i);
			eRef.showEmployee();
		}
		
		System.out.println(">> Enhanced For Loop");
		
		// 7.2 Using Enhanced For Loop
		System.out.println();
		for(Object o1 : list1){
			System.out.println(o1);
		}
		
		System.out.println();
		for(String s1 : list2){
			System.out.println(s1);
		}
		
		System.out.println();
		for(Employee eRef : list3){
			eRef.showEmployee();
		}
		
		System.out.println();
		
		// 7.3 Use API Iterator to Iterate
		Iterator<Object> i1 = list1.iterator();
		Iterator<String> i2 = list2.iterator();
		Iterator<Employee> i3 = list3.iterator();
		
		System.out.println(i1.next());
		System.out.println(i1.next());
		System.out.println(i1.next());
		
		System.out.println();
		
		while(i2.hasNext()){
			String s1 = i2.next();
			System.out.println(s1);
			if(s1.equals("John")){
				i2.remove(); // with iterator we can remove data from ArrayList while iterating
			}
		}
		System.out.println(">> list2 now is: "+list2);
		
		while(i3.hasNext()){
			Employee eRef = i3.next();
			eRef.showEmployee();
		}
		
		// 7.4 Use API ListIterator to Iterate
		ListIterator<String> listItr = list2.listIterator();
		// iterating from from 0 to n-1 : Forward Traversal
		while(listItr.hasNext()){
			String s1 = listItr.next();
			System.out.println(s1);
		}
		
		System.out.println("=======");
		
		// iterating from from n-1 to 0 as well : Backward Traversal
		while(listItr.hasPrevious()){
			String s1 = listItr.previous();
			System.out.println(s1);
		}
		
		System.out.println();
		// 7.5 Use API Enumeration to Iterate : Read Only
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String s1 = enm.nextElement();
			System.out.println(s1);
		}
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mack");
		names.add("Mia");
		
		names.addAll(list2); // add data from list2 into names
		
		names.clear();
		
		System.out.println(">> names is: "+names);
		
		// Thread-Safe or Synchronized Version by default
		Vector<String> vector = new Vector<String>();
		vector.add("John");		//0
		vector.add("Jennie");	//1
		vector.add("Jim");		//2
		vector.add("Jack");		//3
		vector.add("Joe");		//4
		
		vector.clear();
		
		System.out.println(">> vector is: "+vector);
	}

}
