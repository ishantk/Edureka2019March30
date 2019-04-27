package co.edureka.model;

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

// Model or Bean or POJO(Plain Old Java Object)
public class Employee {
	
	// Attributes: Property of Object 
	public int eid;
	public String name;
	public String email;
	public int salary;
	public String address;
	
	public Employee(){
		
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
