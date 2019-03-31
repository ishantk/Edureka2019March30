
public class DataOperations {

	public static void main(String[] args) {
		
		// Operations on Data:
		// Can be performed using Operators
		
		// Arithmetic Operators
		int fare = 200;
		int discount = (10*300)/100;
		int actualFare = fare - discount;
		
		System.out.println("\u20b9"+discount+" Discount is offered on a Fare of \u20b9"+fare);
		System.out.println("Please pay \u20b9"+actualFare+" to book the cab");
		
		int num = 123;
		int remainder = 123 % 100;
		System.out.println(num+" divide by 100 gives remainder of: "+remainder);
		
		// Increment and Decrement Operators
		actualFare++;  // -> actualFare = actualFare + 1
		System.out.println("1 minute gone. New Fare is: "+actualFare);
		++actualFare;  // -> actualFare = actualFare + 1
		System.out.println("2 minutea gone. New Fare is: "+actualFare);
		
		System.out.println("Is Discount Applicable: " + (fare >= 200) );
		
		// 4G Data
		int dataPack = 3;
		// Data in GB
		int data = 5;
		
		System.out.println("Charge \u20b9 500 : "+ (dataPack == 4 && data>=5)); // Both should be true
		System.out.println("Charge \u20b9 300 : "+ (dataPack == 4 || data>=5)); // Anyone should be true
		
		System.out.println("Charge \u20b9 500 : "+ !(dataPack == 4 && data>=5)); // Both should be true
		System.out.println("Charge \u20b9 300 : "+ !(dataPack == 4 || data>=5)); // Anyone should be true
		
		// =  Assignment Operator is used to write data
		int number = 100;
		
		// = Assignment Operator is used to update data
		number = 200;
		
		System.out.println("Is Number equal to 200: "+(number == 200));

	}

}
