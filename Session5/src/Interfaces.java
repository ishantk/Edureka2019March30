// We need interface so as we can have Protocols implemented
interface InfPG{
	
	// if we have n-rules we need to implement all of them
	void transact();    //public abstract void transact();
	void viewBalance(); //public abstract void viewBalance();
	
}

interface InfBank{
	void minimumBalance();
	void viewBalance();
}

// Object to Object : non static
// Class to Class	: static
// Interface to Interface Inheritance : Here we also have multiple inheritance supported
interface Inf extends InfPG, InfBank{ // extends InfPG, InfBank in multiple
	// Attribute of an interface : public static final
	int i = 10;		// public static final int i = 10;
}

class MyPaymentGW implements Inf{//implements InfPG, InfBank{ 		//implements InfPG, InfBank { -> Multiple Implementation
	
	public void transact(){
		System.out.println(">> Transaction Initiated");
	}
	
	public void viewBalance(){
		System.out.println(">> Balance Details");
	}
	
	public void minimumBalance(){
		System.out.println(">> Must have some Minimum Balance");
	}

	public void register(){
		System.out.println(">> Register Here");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		
		// Polymorphic Statement : Ref Var of Interface can point to the object which implements it !!
		/*InfPG iPg = new MyPaymentGW();
		iPg.transact();
		iPg.viewBalance();*/
		//iPg.minimumBalance();   // error
		//iPg.register();			// error
		
		/*InfBank iBk = new MyPaymentGW();
		iBk.minimumBalance();
		iBk.viewBalance();*/
		//iBk.transact();	// error
		//iBk.register(); // error
		
		Inf iRef = new MyPaymentGW();
		iRef.transact();
		iRef.minimumBalance();
		iRef.viewBalance();
		//iRef.register(); // error
		
		System.out.println("i is: "+Inf.i);
		//Inf.i = 100; // error: since we cannot modify final variable
				

	}

}
