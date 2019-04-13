// Cab : Generalized Version
/*class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition);
	}
}*/

// Limit the User not to create objects of Cab
// Cab cannot have objects or cannot be instantiated
// Refined RTP by introducing abstract class and abstract method
// we cannot create the object of abstract class but RTE i.e. JVM can do so for abiding of Inheritance Rule !!
// Challenge: Cab Objects are constructed in the memory which are of no use other than to support RTP
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// if Cab object cannot be created, this method bookCab cannot be executed !!
	/*void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition);
	}*/
	
	// Lets eliminate the definition by making it an abstract method
	// abstract method is created in abstract class
	// This becomes a RULE in the Parent which Child Objects must define
//	abstract void bookCab(String source, String destinition);
//}

// Most Refined Version of RTP
// For interfaces we cannot have objects hence, inheritance is not possible | Object to Object we cannot have inheritance
interface Cab{
	
	// error -> interfaces cannot have constructors -> neither we nor JVM can create its Objects
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/

	
	// Interface will have only rules like below:
	// This becomes a RULE in the interface which any Object can abide 
	void bookCab(String source, String destinition); // public abstract void bookCab(String source, String destinition);
}

// IS-A Relationship 
// Implementation Relationship -> Implementing the rules
class UberGo implements Cab{//extends Cab{
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	// Defined the Rule in the Child Object which was created in the Parent Object
	public void bookCab(String source, String destinition){
		System.out.println(">> UberGo Booked from "+source+" to "+destinition);
	}
}

class UberX implements Cab{//extends Cab{
	
	UberX(){
		System.out.println(">> UberX Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> UberX Booked from "+source+" to "+destinition);
	}
}

class UberBike implements Cab{//extends Cab{
	
	UberBike(){
		System.out.println(">> UberBike Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> UberBike Booked from "+source+" to "+destinition);
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*
		Cab cRef;
		cRef = new Cab();
		
		cRef.bookCab("Country Homes", "Pristine Magnum");
		*/
		// 1. Parent Object is Constructed before Child Object
		// 2. Overriding into Action
		//UberGo uGo = new UberGo();
		//uGo.bookCab("Country Homes", "Pristine Magnum");
		
		// Rule3: Reference Variable of Parent can point to object of child
		// Ref Var of Interface can point to the object which implements it !!
		Cab cRef;
		
		cRef = new UberGo(); // Polymorphic Statement
		cRef.bookCab("Country Homes", "Pristine Magnum"); // Overriding shall be in action
		
		System.out.println();
		
		cRef = new UberX();
		cRef.bookCab("Country Homes", "Pristine Magnum"); // Overriding shall be in action
		
		System.out.println();
		
		cRef = new UberBike();
		cRef.bookCab("Country Homes", "Pristine Magnum"); // Overriding shall be in action
		
		//System.out.println();
		//cRef = new Cab();			// are not required to be created by us !!
		//cRef.bookCab("Country Homes", "Pristine Magnum");
	}

}
