package co.edureka;

/*
 	SQL Command:
 	
 	create table Employee(
 		eid int primary key auto_increment,
 		name varchar(256),
 		email varchar(256),
 		salary int,
 		address varchar(1024)
 	)
 
 
 */

// ORM : Object Relational Mapping

public class Employee {
	
	// Attributes: Property of Object 
	int eid;
	String name;
	String email;
	int salary;
	String address;
	
	Employee(){
		
	}

	public Employee(int eid, String name, String email, int salary, String address) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}
	
	// Override a built in toString method
	public String toString() {
		return eid+", "+name+", "+email+", "+salary+", "+address;
	}
}
