class Animal{
	
	Animal(){
		System.out.println(">> Animal Object Constructed");
	}
	
}

// IS-A Relationship | Parent-Child Relation
// Lion is-an animal | Animal is Parent and Lion is Child
// extends is used to perform Inheritance i.e. to create Parent Child Relationship
class Lion extends Animal {
	
	Lion(){
		System.out.println(">> Lion Object Constructed");
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		//Animal aRef = new Animal();
		
		// Rule1 : Object of Parent is constructed before the object of child is constructed
		// 		   in our example we shall see that Animal object is constructed before Lion Object 
		Lion lRef = new Lion();

	}

}


/*
	1. Single Level
	A
	|
	B
	
	class A{
	
	}
	class B extends A{
	
	}
	
	2. Multi Level
	A
	|
	B
	|
	C
	
	class A{
	
	}
	class B extends A{
	
	}
	class C extends B{
	
	}
	
	3. Multiple Inheritance -> X not supported in Java
	A	B
	  |
	  C
	  
	class A{
	
	}
	class B {
	
	}
	class C extends A, B{ // extends A, B{-> Error
	
	}  
	
	4. Hierarchy
		A
		|
	  B   C
	  
	class A{
	
	}
	class B extends A{
	
	}
	class C extends A{
	
	}   	
	
	5. Hybrid
	A
	|
	B
	|
	C
	|
  D   E
  	  |
  	 F G 
	
*/
