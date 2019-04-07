
class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
}

// IS-A Relationship
// LuxuryCab IS-A Cab | LuxuryCab is Child and Cab is Parent
class LuxuryCab extends Cab{
	
	LuxuryCab(){
		System.out.println(">> LuxuryCab Object Constructed");
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		//Cab c1 = new Cab();
		
		// We are requesting for the Object of LuxuryCab
		LuxuryCab lc = new LuxuryCab();
		
		// Rule 1: When we request for the Object of Child, Object of Parent is Constructed before the Object of Child
		// 		   Object to Object Inheritance

	}

}
