package co.edureka.model;

// Model or Bean or POJO (Plain Old Java Object)
public class User {

	// Attributes:
	public String name;
	public String email;
	public String password;
	
	public User() {
	
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	public boolean validateLogin(){
		return !(email.isEmpty() && password.isEmpty());
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}

/*

 SQL Query:
 create table User(
	uid int primary key auto_increment,
	name varchar(256),
	email varchar(256),
	password varchar(256)    
)
*/