package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Model : Structure of Object

@Entity
@Table(name = "MYEMPLOYEES")
public class Employee {

	// Attributes : Property of Object
	@Id @GeneratedValue
	@Column(name = "EID")
	Integer eid;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "AGE")
	Integer age;
	
	@Column(name = "SALARY")
	Integer salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eid, String name, String email, Integer age, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", age=" + age + ", salary=" + salary
				+ "]";
	}	
	
}
