package co.edureka.model;

import java.util.List;

public class Customer {

	Integer cid;
	String name;
	String phone;
	String email;
	
	List<Address> addresses; // HAS-A Relationship | 1 to many

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", addresses="
				+ addresses + "]";
	}
}
