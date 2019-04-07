// 2. Textual Representation of an Object
class Employee{
	
	// Attributes: Property of Object
	int eid;
	String name;
	int salary;
	
	// Attributes: Property of Class
	static String companyName;
	static int employeeCount=0;
	
	// Constructor : Property Of Object
	Employee(){
		eid = 0;
		name = "NA";
		salary = 0;
		employeeCount++; // static can be accessed in non static
	}

	// Constructor : Property Of Object
	Employee(int eid, String name, int salary){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		employeeCount++; // static can be accessed in non static
	}
	
	// non static method : Property Of Object
	void showEmployee(){
		System.out.println(eid+" belongs to "+name+" and withdraws salary amount of \u20b9"+salary);
		// We can access property of class in property of object
		// but vice versa is not allowed
		System.out.println(">> Company Details: "+companyName);
	}
	
	// static method : Property of Class
	static void showCompanyName(){
		// Here we cannot access property of object
		System.out.println(">> "+companyName+" has "+employeeCount+" Employees << ");
	}
	
}

public class StaticKeword {

	public static void main(String[] args) {
		
		// Whatever is property of Object is accessed with reference variable of that Object
		Employee eRef1 = new Employee(101, "John", 50000);
		Employee eRef2 = new Employee(201, "Fionna", 60000);
		Employee eRef3 = new Employee();
		
		eRef1.showEmployee();
		eRef2.showEmployee();
		
		// Whatever is property of class is accessed with class name
		Employee.companyName = "ABC International";
		Employee.showCompanyName();
		
		// Property of class can be accessed by object or its reference variable
		eRef1.showCompanyName();
		eRef2.showCompanyName();
		
		// static 		: class data  
		// non static 	: object data
		
		// We updated the data for companyName in class
		eRef1.companyName = "XYZ Technologies";
		
		System.out.println();
		
		eRef1.showEmployee();
		eRef2.showEmployee();

	}

}
