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