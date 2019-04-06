import java.util.Scanner; // Scanner is a Built in Class


public class MethodMemMgmt {

	// Non Static Method
	void comparNumbers(int num1, int num2){ // Inputs/Arguments
		if(num1 > num2){
			System.out.println(num1+" is greater than "+num2);
		}else{
			System.out.println(num2+" is greater than "+num1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is start of main");
		
		// Object Construction Statement
		MethodMemMgmt mRef = new MethodMemMgmt();
		
		// To read data from User on Console we can use Scanner class which is a built in class
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> Enter n1: ");
		int n1 = scanner.nextInt();
		
		System.out.println(">> Enter n2: ");
		int n2 = scanner.nextInt();
		
		mRef.comparNumbers(n1, n2); // Passing the data for inputs/arguments
		
		System.out.println("This is end of main");

		// System.out -> to display the data on console(system)
		// System.in ->  to read the data from console(system)
		
	}

}

// API is Application Programming Interfaces
// 		  Whatever is given as built in class or method to use can be referred to as API
