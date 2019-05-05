package co.edureka.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // HAS-A Relationship
	
	public CB() {
		System.out.println(">> CB Object Constructed");
	}

	//@Autowired
	public CB(CA ca) {
		System.out.println(">> Constructor Injection");
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		System.out.println(">> Setter Injection");
		this.ca = ca;
	}
	
}
