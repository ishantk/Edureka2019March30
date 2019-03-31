
public class NDimArrays {

	public static void main(String[] args) {
		
		// 1-D Array -> Array Containing Data
		int[] a1 = {10, 20, 30, 40, 50};
		//			0    1   2   3   4
		
		// 2-D Array -> Array of Arrays(Containing Data)
		int[][] a2 = {
						{10, 20},					// 0
						{10, 20, 30, 40, 50},		// 1
						{10, 20, 30},				// 2
						{10},						// 3
						{10, 20, 30}				// 4
				     };
		
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);				// HashCode
		System.out.println("a2 is: "+a2+" and length is: "+a2.length);				// HashCode
		System.out.println("a2[0] is: "+a2[0]+" and length is: "+a2[0].length); 	// HashCode	
		
		// Update Operation
		a2[0][1] = 111;
		a2[1][2] = 222;
		a2[4][2] = 444;
		
		// Read Array
		System.out.println("a2[0][0] is: "+a2[0][0]);
		System.out.println("a2[0][1] is: "+a2[0][1]);
		
		// Read Entire Array
		System.out.println("------------------");
		for(int i=0;i<a2.length;i++){ 			// i: 0 to 4
			for(int j=0;j<a2[i].length;j++){ 	// i:0, j:2 | i:1, j:5 | i:2, j:3 | i:3, j:1 | i:4, j:3 
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		System.out.println();
		
		int[][] a3 = new int[3][5];
		// 3 1-D Arrays, with each 1-D Array having 5 elements and all the elements will be 0
		
		int[][] a4 = new int[3][];
		// 3 1-D Arrays with each 1-D Array not initialized
		a4[0] = new int[5];
		a4[1] = new int[10];
		a4[2] = new int[15];
		
		System.out.println("------------------");
		for(int i=0;i<a4.length;i++){ 			// i: 0 to 4
			for(int j=0;j<a4[i].length;j++){ 	// i:0, j:2 | i:1, j:5 | i:2, j:3 | i:3, j:1 | i:4, j:3 
				System.out.print(a4[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("------------------");

		// HW:  Explore Enhaced For Loop on 2-D Arrays
		//		Explore 3-D Arrays
		
	}

}
