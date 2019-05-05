package co.edureka.model;

public class Connection {

	String url;
	String dbName;
	String username;
	String password;
	
	public Connection() {
		System.out.println(">> Connection Object Constructed with Default Constructor");
	}

	public Connection(String url, String dbName, String username, String password) {
		System.out.println(">> Connection Object Constructed with Paramtereized Constructor");
		this.url = url;
		this.dbName = dbName;
		this.username = username;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", dbName=" + dbName + ", username=" + username + ", password=" + password
				+ "]"+super.toString();
	}
	
	// myInit and myDestroy can be any name of your choice
	public void myInit(){
		System.out.println(">> myInit executed");
	}
	
	public void myDestroy(){
		System.out.println(">> myDestroy executed");
	}
	
}
