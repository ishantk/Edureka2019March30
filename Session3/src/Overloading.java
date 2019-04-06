
public class Overloading {
	
	// Compile Time Polymorphism 
	// Overloading
	/*
	 	1. Method Name is Same
	 	2. Signature or Inputs are different
	 		2.1 number of inputs
	 		2.2 type of inputs
	 		2.3 sequence of inputs
	 	3. Return Type has no role to play
	 */

	void addNumbers(int num1, int num2){
		System.out.println(num1+" and "+num2+" adds up to "+(num1+num2));
	}
	
	// Return Type has no role to play
	/*int addNumbers(int num1, int num2){
		return (num1+num2);
	}*/
	
	void addNumbers(int num1, int num2, int num3){
		System.out.println(num1+" and "+num2+" and "+num3+" adds up to "+(num1+num2+num3));
	}
	
	int addNumbers(int[] nums){
		int sum = 0;
		
		for(int elm : nums){
			sum = sum + elm;
		}
		
		return sum;
	}
	
	void addNumbers(double num1, double num2){
		System.out.println(num1+" and "+num2+" adds up to "+(num1+num2));
	}
	
	void addNumbers(int num1, double num2){
		System.out.println(num1+" and "+num2+" adds up to "+(num1+num2));
	}
	
	void addNumbers(double num1, int num2){
		System.out.println(num1+" and "+num2+" adds up to "+(num1+num2));
	}
	
	static void square(int num){
		System.out.println("Square of "+num+" is: "+(num*num));
	}
	
	
	// Can create methods before of after the main. but not in the main !! :)
	public static void main(String[] args) {
		Overloading oRef = new Overloading();
		oRef.addNumbers(10, 20);
		oRef.addNumbers(10, 20, 30);
		oRef.addNumbers(10, 2.2);
		oRef.addNumbers(2.2, 22);
		oRef.addNumbers(2.2, 3.3);
		
		int[] arr = {1, 3, 5, 7, 9};
		System.out.println("Sum of Elements of arr is: "+oRef.addNumbers(arr));
		
		// Compiler at Compile time shall link which method execution shall execute which definition
		// Binding : Linking of Call to Definition
		
		Overloading.square(5);
		Overloading.square(5.5);

	}
	
	static void square(double num){
		System.out.println("Square of "+num+" is: "+(num*num));
	}

}
