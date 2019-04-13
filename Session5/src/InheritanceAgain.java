class Parent{
	
	// Attribute: Property of Object
	int wealth;
	
	// Constructor : Property of Object
	Parent(){
		System.out.println(">> Parent Object Constrcuted");
	}

	// Method : Property of Object
	void showVehicle(){
		System.out.println(">> Parent has Maruti Swift Car");
	}
	
	void showWealth(){
		System.out.println(">> Wealth is: "+wealth);
	}
	
	// Method : Property of Class
	static void showCompany(){
		System.out.println(">> Parent has a company called: ABC International");
	}
	
}

// Inheritance : IS-A Relationship
class Child extends Parent{
	
	Child(){
		System.out.println(">> Child Object Constrcuted");
	}
	
	// Overriding
	void showVehicle(){
		// super is a reference variable which can be used to access parent objects data from child object
		super.showVehicle(); // Access the Property of Parent Object with super keyword
		System.out.println(">> Child has Honda City Car");
	}
	
	// Hiding
	static void showCompany(){
		Parent.showCompany(); // // Access the Property of Parent Object with Parent Class
		System.out.println(">> Child has a company called: XYZ Global");
	}
}


public class InheritanceAgain {

	public static void main(String[] args) {
		
		Child ch = new Child();
		// R1: Before object of Child object of Parent shall be constructed
		// R2: We will get a relationship between these 2 objects so that Child can access anything of Parent (Vice Versa is not possible)
		
		// Child Object can access property of Parent Object
		ch.showVehicle();  // shall execute Child's Definition if Child will have it : Overriding
		ch.wealth = 10000; // wrote data for Parent Object's property
		ch.showWealth();
		
		Child.showCompany(); // shall execute Child's Definition if Child will have it : Hiding

	}

}
