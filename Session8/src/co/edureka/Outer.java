package co.edureka;

public class Outer {
	
	void show(){
		System.out.println(">> This is show of Outer");
	}

	// Nested Class : Used as a Helper Class to Outer
	class Inner{
		
		void show(){
			System.out.println(">> This is show of Innner");
		}
		
	}
	
	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner(); // Object within an Object | Containment
		iRef.show();

	}

}
