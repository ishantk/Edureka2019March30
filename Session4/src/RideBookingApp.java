// 2. Create the Class
// Textual Representation how an Object will look like in memory when you shall create it
/*class User{
	
	// Attributes: Property of Object and not of Class
	//  		   Even though you have written in class but they are actually a part of real time object
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
}*/


public class RideBookingApp {

	public static void main(String[] args) {
		
		// 3. Create the Real Object in Memory
		// Object Construction Statement
		User uRef1 = new User(); // -> new User(); is object creation and constructor execution
		User uRef2 = new User();
		
		// This is not Object Construction and hence no constructor execution for uRef3
		User uRef3 = uRef1; // Reference Copy
		
		// We have just 2 Objects.
		// 1 Object has 2 Reference Variables uRef1 and uRef3
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// uRef1 and uRef2 are reference variables which contains HashCode for Objects
		// Reference Variable are created in Stack and Objects in Heap
		
		// Write Data in Object
		uRef1.name = "John";
		uRef1.phone = "+91 99999 88888";
		uRef3.email = "john@example.com";
		uRef3.age = 22;
		uRef1.gender = 'M';
		uRef1.address = "Redwood Shores";
		
		uRef2.name = "Fionna";
		uRef2.phone = "+91 77777 88888";
		uRef2.email = "fionna@example.com";
		uRef2.age = 26;
		uRef2.gender = 'F';
		uRef2.address = "Pristine Magnum";
		
		
		// Update Data in Object
		uRef3.name = "John Watson";
		uRef1.age = 27;
		
		uRef2.name = "Fionna Flynn";
		uRef2.address = "Country Homes";
		
		// Reading Data from Object
		System.out.println(uRef1.name+" is "+uRef1.age+" years old and lives at "+uRef3.address);
		System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives at "+uRef2.address);
		
		// Delete of Object shall happen automatically
		// Garbage Collector shall delete the Objects from Heap automatically whne they are no longer required !!
	
		// What's the need to 2 different ref vars for same object !!
		// Google Drive is an Object where we can store data
		// Accessing from my web browser and mobile phone both are allowed
		// WebBrowser is ref1 and MobileApp is ref2
		
		// CHALLENGE
		// If we have to create n number of objects
		// Reading and Writing in this way is difficult for us
		// SOLUTION
		// We shall create methods in an Object
		
		User uRef4 = new User();
		uRef4.writeUserData("Leo", "+91 989898 989898", "leo@example.com", 'M', 22, "Pristine Magnum");
		uRef4.showUserData();
		
		// We have some default values to attributes when we create an object
		// This is possible because compiler creates a special method called constructor
		User uRef5 = new User(); // User(); -> Execution of Constructor
		// Constructor is executed immediately after object is constructed in the memory
		uRef5.showUserData();
		
		User uRef6 = new User("Mike", "+91 99889 99889", "mike@example.com", 'M', 30, "Clover Heights");
		uRef6.showUserData();
		
	}

}
