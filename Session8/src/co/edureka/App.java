package co.edureka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		
		// SQL Command:
		// insert into Employee values(1, 'John', 'john@example.com', 30000, 'Redwood Shores')
		// update Employee set name = 'John Watson', salary = 77500, address = 'Pristine Magnum' where eid = 1 
		// delete from Employee where eid = 1
		// select * from Employee
		// select eid, name from Employee
		// select * from Employee where salary > 50000
		
		// Employee Object Construction
		Employee e1 = new Employee(1, "Dolly", "dolly@example.com", 55700, "County Homes");
		
		// View Object's Data
		System.out.println(e1); // this will automatically execute toString method in our object
		
		// Update Object
//		e1.name = "John Watson";
//		e1.salary = 77500;
//		
//		System.out.println(e1);
		
		// Delete Operation : happens automatically in Java. Garbage Collector shall delete the Objects
		
		// JDBC Procedure:
		
		try {
			
			// 1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
			
			// 2. Create Connection
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created with DB");
			
			// 3. Write SQL Statement
			String sql = "insert into Employee values(null, '"+e1.name+"', '"+e1.email+"', "+e1.salary+", '"+e1.address+"')";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql); //executeUpdate is used to insert/update/delete
			if(i>0){
				System.out.println(">> 4. SQL Statement Executed for "+e1.name);
			}else{
				System.out.println(">> 4. SQL Statement Execution Failed");
			}
			
			// 5. Close the Connection
			con.close();
			System.out.println(">> 5. Connection Closed with DB");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		// Try Executing update and delete commands. Just change String sql = "//....";

	}

}
