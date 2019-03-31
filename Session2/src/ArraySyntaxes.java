
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Creating Arrays with values to the indexes.
		// PrePopulating Container with Data
		int[] a1 = {10, 20, 30, 40, 50};			// Implicit Array Creation | shall be taken care automatically int[] a1 = new int[]{10, 20, 30, 40, 50};
		int[] a2 = new int[]{10, 20, 30, 40, 50};	// Explicit Array Creation
		
		// new operator shall create Array dynamically i.e. at Run Time in the Heap Area
		
		int a3[] = {70, 80, 90};
		int a4[] = new int[]{70, 80, 90, 100};
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		System.out.println("a3 is: "+a3);
		System.out.println("a4 is: "+a4);
		
		// Creating Arrays with no values
		// We shall populate container with data later in our program
		int[] a5 = new int[10]; // 10 indexes from 0 to 9, all of them having value as 0
		System.out.println("a5 is: "+a5);
		
		// Update Operation
		a5[0] = 111;
		a5[5] = 555;
		a5[9] = 999;
		
		for(int elm : a5){
			System.out.print(elm+"  ");
		}

	}

}
