// Single Value Containers : PRIMITIVE TYPES IN JAVA
//							 They Hold Value i.e. Data and hence known as Primtives
public class DataTypes {

	public static void main(String[] args) {
		
		// Job1 : Create a Storage Container
		byte age = 10;
		// age is the name of storage container
		// byte defines the type of container and size of container which is 1 byte
		// 2 pow 8 -> 256 -> divide by 2 -> Range -> -128 to 0 to 127
		// 10 is data i.e. value and we also say it as Literal
		
		// Job2: Update Storage Container
		age = 20;
		//age = 128; // out of range
		//age = -160;  // out of range
		
		// Job3: Read data of Storage Container
		System.out.println("age is: "+age);
		
		// Delete Operation : Storage Container is deleted automatically when main will finish
		
		int salary = 300000; 		// 4 bytes wide
		long number = 9090909090l;	// literals can be long. just write L or l in the end

		double pi = 3.14;			// 64 bits
		double tax = 2345126.1234;
		
		// 32 bits
		float average = 93.63f;		// Floating Point Literals shall take F or f in the end
		
		char ch1 = 'A';
		char ch2 = 67;				// ASCII CODE
		char ch3 = '\u0958';		// UNICODE
		
		System.out.println("ch1 is: "+ch1);
		System.out.println("ch2 is: "+ch2);
		System.out.println("ch3 is: "+ch3);
		
		boolean isInternetOn = true;
		isInternetOn = false;
		
		System.out.println("John Withdraws a salary amount of \u20b9"+salary);
		
	}

}
