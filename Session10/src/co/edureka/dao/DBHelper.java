package co.edureka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edureka.model.User;

public class DBHelper {

	Connection con;
	
	// Constructor
	public DBHelper() {
		try {
			// 1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
			
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
	}
	
	public void createConnection(){
		try {
			
			// 2. Create Connection
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created with DB");			
			
			
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
		
	}
	
	public int saveUser(User user){
		
		int i=0;
		
		try {
			
			// 3. Write SQL Statement
			String sql = "insert into User values(null, ?, ?, ?)";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.name);
			stmt.setString(2, user.email);
			stmt.setString(3, user.password);
			
			i = stmt.executeUpdate(); //executeUpdate is used to insert/update/delete
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User user){
		
		boolean isAuthenticated = true;
		
		try {
			
			// 3. Write SQL Statement
			String sql = "select * from User where email = ? and password = ?";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.email);
			stmt.setString(2, user.password);
			
			ResultSet rs = stmt.executeQuery();
			isAuthenticated = rs.next(); // next will return true if we have record else it will return false
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
		
		return isAuthenticated;
	}
		
	public void closeConnection(){
		try {
			// 5. Close the Connection
			con.close();
			System.out.println(">> 5. Connection Closed with DB");
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
}
