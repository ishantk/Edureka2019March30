package co.edureka.model;

import java.util.List;

public class Customer {

	String name;
	String phone;
	String email;
	
	// Assuming 1 Customer can order 1 Dish
	Dish dish; // HAS-A Relationship | 1 to 1 dish is a dependency
	
	List<String> sauces;
	
	public Customer() {
		System.out.println(">> Customer Object Constructed");
		//dish = new Dish(); // Dish Object Creation will be dependent on Customer Object Creation | high Coupling
	}
	
	// Constructor Injection
	public Customer(Dish dish) { // passing object by reference makes object to be constructed spearately -> low coupling
		System.out.println(">> Customer Object Constructed - Constructor Injection");
		//dish = new Dish(); // Dish Object Creation will be dependent on Customer Object Creation | high Coupling
		this.dish = dish;
	}
	
	public Dish getDish() {
		return dish;
	}

	// Setter Injection
	public void setDish(Dish dish) {
		System.out.println(">> Setter Injection");
		this.dish = dish;
	}

	public List<String> getSauces() {
		return sauces;
	}

	public void setSauces(List<String> sauces) {
		this.sauces = sauces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", dish=" + dish + "]";
	}
	
	
}
