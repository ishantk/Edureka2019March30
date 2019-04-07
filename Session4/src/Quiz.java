// Textual Representation of an Object
class Counter{
	
	// Attributes:
	int count;				// Object's Data
	static int scount;		// Class's Data
	
	// Constructor:
	Counter(){
		count = 1;
		scount = 1;
	}
	
	// Methods:
	void incrementCount(){
		count++; // count = count + 1;
		scount++;
	}
	
	void showCount(){
		System.out.println("count is: "+count+" and scount is: "+scount);
	}
}

public class Quiz {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(); // 1	1
		Counter c2 = new Counter(); // 1	1
		Counter c3 = c1; // Reference Copy
		
		c1.incrementCount();		// 2	2
		c2.incrementCount();		// 2	3
		c3.incrementCount();		// 3	4
		
		c1.incrementCount();		// 4	5
		c2.incrementCount();		// 3	6
		c3.incrementCount();		// 5	7
		
		Counter c4 = new Counter();	// 1	1
		c4.incrementCount();		// 2	2
		
		c1.showCount(); // count is: 5 and scount is: 2
		c2.showCount(); // count is: 3 and scount is: 2
		c3.showCount(); // count is: 5 and scount is: 2
		c4.showCount(); // count is: 2 and scount is: 2

	}

	// If we are clear on fundamental called class vs object -> :)
	// class : static
	// object: non static
}
