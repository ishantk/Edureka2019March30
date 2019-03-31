
public class Arrays {

	public static void main(String[] args) {
		
		// Creating Containers
		int a1 = 10; 						// Single Value Container
		
		// Array
		// Create Operation
		int[] a2 = {10, 20, 30, 40, 50};	// Multi Value Container
		
		// Read Containers
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		// a1 holds a value	 -> Primitive Type
		// a2 holds HashCode -> Reference Type
		
		// a2 is a Reference Variable which contains HashCode (some hex number) which points to Array in the Heap Area
		
		// Update Operation
		a2[3] = 333;
		
		// Read MVC i.e. Array
		//System.out.println("a2[0] is: "+a2[0]);	// 10
		//System.out.println("a2[2] is: "+a2[2]);	// 30
		//System.out.println("a2[4] is: "+a2[4]); // 50
		
		for(int i=0;i<a2.length;i++){
			System.out.println("a2["+i+"] is: "+a2[i]);
		}

		// Enhanced For Loop | for-each loop
		// one by one elements in a2 will be copied in elm from 0 to n-1, where n is size of Array
		for(int elm : a2){
			System.out.println(">> "+elm);
		}
		
		System.out.println("Size of Array a2 is: "+a2.length);
	
		// Arrays are Fixed in Size. Once you create them they cannot be re-created.
		int[] a3 = null; // a3 is a Reference variable which is not pointing to any Array
		// We can assign References to null.
		
		//int num; // num will not have any default value
		//System.out.println("num is: "+num); // error : Initialize Before Use Principle
		
		int num = 5;						// Default Value Provided
		System.out.println("num is: "+num); // OK
	}

}
