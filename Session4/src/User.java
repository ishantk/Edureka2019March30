// 2. Create the Class
// Textual Representation how an Object will look like in memory when you shall create it
	
public class User {
	// Attributes: Property of Object and not of Class
	// Even though you have written in class but they are actually a part of real time object in memory
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
	// Special Method: Constructor
	// Same name as that of class name and no return type
	/*User(){
		name = null;
		phone = null;
		email = null;
		gender = ' ';
		age = 0;
		address = null;
	}*/
	
	// Default Constructor as it takes no inputs
	User(){
		name = "NA";
		phone = "NA";
		email = "NA";
		gender = 'U';
		age = 0;
		address = "NA";
	}
	
	// Overloading Of Constructor
	// Parameterized Constructor
	
	User(String name, String phone, String email, char gender, int age, String address){
		// We can have method inputs as same names matching attribute names
		// this is a reference variable which holds HashCode of Current Object
		
		// LHS this.name is attribute of object and RHS name is property of Constructor
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	
	// Methods: Property of Object and not of Class
	void writeUserData(String name, String phone, String email, char gender, int age, String address){
		// We can have method inputs as same names matching attribute names
		// this is a reference variable which holds HashCode of Current Object
		
		// LHS this.name is attribute of object and RHS name is property of Method
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	void showUserData(){
		System.out.println("===Details of: "+name+"===");
		System.out.println(">> Phone: "+phone);
		System.out.println(">> Email: "+email);
		System.out.println(">> Gender: "+gender);
		System.out.println(">> Age: "+age);
		System.out.println(">> Address: "+address);
		System.out.println("=====================");
		System.out.println();
	}
}
