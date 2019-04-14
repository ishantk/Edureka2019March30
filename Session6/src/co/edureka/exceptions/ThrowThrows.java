package co.edureka.exceptions;

import java.io.IOException; // We are importing a built in IOException class which is Checked Exception

// RuntimeException and its children are UNCHECKED Exceptions
// Other than RuntimeException all are CHECKED Exceptions

// Creating a User Defined UNCHECKED Exception
class MyBankingException extends RuntimeException{ // IS-A Relationship
	MyBankingException(String message){
		super(message); // Parent's Constructor
	}
}

//Creating a User Defined CHECKED Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message); // Parent's Constructor
	}
}

class BankAccount{
	
	int balance = 10000;
	int attempts = 0;
	
	void withdraw(int amount){
		
		balance = balance - amount;
		
		if(balance < 0){
			balance = balance + amount;
			System.out.println(">> Sorry !! You have a low balance \u20b9"+balance);
			attempts++;
		}else{
			System.out.println(">> Withdrawl Success !! New Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3){
			// Throwing an UNCHECKED Exception
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts");
			//throw aRef; // We are throwing an Exception ourselves to crash program
			
			MyBankingException mRef = new MyBankingException("Illegal Attempts");
			throw mRef;
		}
	}
	
	// throws keyword is used in the method signature in case you are throwing a checked exception !!
	void withdrawAgain(int amount) throws IOException, YourBankingException{
		
		balance = balance - amount;
		
		if(balance < 0){
			balance = balance + amount;
			System.out.println(">> Sorry !! You have a low balance \u20b9"+balance);
			attempts++;
		}else{
			System.out.println(">> Withdrawl Success !! New Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3){
			// Throwing an CHECKED Exception
			//IOException iRef = new IOException("Illegal Attempts");
			//throw iRef; // We are throwing an Exception ourselves to crash program
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts");
			throw yRef;
		}
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		BankAccount bRef = new BankAccount();
		
//		for(int  i=1;i<=100;i++){
//			bRef.withdraw(3000);
//		}
		
		try{
			for(int  i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
		System.out.println(">> App Finished");

	}

}
