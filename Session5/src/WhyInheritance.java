
// Lets create some eCommerce App Structure
// We got so many different products to be sold. eg: Shoe, Mobile, LED, Shirt .....
// Shoe, Mobile, LED, Shirt are all Objects with their attributes !!

// Structure of a Shoe Object
/*
class Shoe{
	
	// Attributes : Property of Object
	int pid;
	String name;
	String brand;
	int price;
	int size;
	String color;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setDataForShoe(int pid, String name, String brand, int price, int size, String color){
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.color = color;
		// this.attribute on LHS is property of object and RHS variable belongs to method
	}
	
	void showShoeDetails(){
		System.out.println();
		System.out.println("====================================");
		System.out.println(pid+" | "+name+" | "+price+" | "+brand);
		System.out.println("Size:"+size);
		System.out.println("Color:"+color);
		System.out.println("====================================");
	}
}

class Mobile{
	
	// Attributes : Property of Object
	int pid;
	String name;
	String brand;
	int price;
	int ram;
	int memory;
	String os;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	void setDataForMobile(int pid, String name, String brand, int price, int ram, int memory, String os){
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.memory = memory;
		this.os = os;
		// this.attribute on LHS is property of object and RHS variable belongs to method
	}
	
	void showMobileDetails(){
		System.out.println();
		System.out.println("====================================");
		System.out.println(pid+" | "+name+" | "+price+" | "+brand);
		System.out.println("RAM:"+ram);
		System.out.println("Memory:"+memory);
		System.out.println("OS:"+os);
		System.out.println("====================================");
	}
}
*/

// Whatever the common attributes or methods which were repeated again and again in all the various classes
// We have shifted it to Product Class
class Product {
	
	// Attributes 
	int pid;
	String name;
	String brand;
	int price;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setDataForProduct(int pid, String name, String brand, int price){
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		// this.attribute on LHS is property of object and RHS variable belongs to method
	}
	
	void showProductDetails(){
		System.out.println(pid+" | "+name+" | "+price+" | "+brand);
	}
}


// IS-A Relationship -> Shoe IS-A Product | Product is Parent and Shoe is Child
class Shoe extends Product{
	
	// Attributes : Property of Object
	
	int size;
	String color;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setDataForShoe(int pid, String name, String brand, int price, int size, String color){
		setDataForProduct(pid, name, brand, price); // We are accessing the property of Parent Object in Child Object.
		this.size = size;
		this.color = color;
		// this.attribute on LHS is property of object and RHS variable belongs to method
	}
	
	void showShoeDetails(){
		System.out.println();
		System.out.println("====================================");
		showProductDetails();						// We are accessing the property of Parent Object in Child Object.
		System.out.println("Size:"+size);
		System.out.println("Color:"+color);
		System.out.println("====================================");
	}
}

class Mobile extends Product{
	
	// Attributes : Property of Object
	int ram;
	int memory;
	String os;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	void setDataForMobile(int pid, String name, String brand, int price, int ram, int memory, String os){
		setDataForProduct(pid, name, brand, price); // We are accessing the property of Parent Object in Child Object.
		this.ram = ram;
		this.memory = memory;
		this.os = os;
		// this.attribute on LHS is property of object and RHS variable belongs to method
	}
	
	void showMobileDetails(){
		System.out.println();
		System.out.println("====================================");
		showProductDetails();						// We are accessing the property of Parent Object in Child Object.
		System.out.println("RAM:"+ram);
		System.out.println("Memory:"+memory);
		System.out.println("OS:"+os);
		System.out.println("====================================");
	}
}

// If we create n objects, we will be repeating the same code again and again !!
// Let us save our time by performing Generalization.

public class WhyInheritance {

	public static void main(String[] args) {
		
		// We are requesting for the Object of Shoe
		// But before Shoe Object is constructed, Product Object shall be constructed
		Shoe sRef = new Shoe();
		
		// Rule2 : All the properties of Parent Object can be accessed by Child Object
		// 		   Anything other than private in Parent can be accessed by child
		
		Mobile mRef = new Mobile();
		
		sRef.setDataForShoe(101, "AlphaBounce", "Adidas", 10000, 9, "Black");
		mRef.setDataForMobile(201, "iPhoneX", "Apple", 80000, 4, 128, "iOS");
		
		sRef.showShoeDetails();
		mRef.showMobileDetails();

	}

}
