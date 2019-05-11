package co.edureka;

public class Connection {

	// Lets create object in here !!
	private static Connection con = new Connection();
	
	private Connection(){
		System.out.println(">> Connection Object Constructed");
	}
	
	public static Connection getConnection(){
		return con;
	}
	
}
