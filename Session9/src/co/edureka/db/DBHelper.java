package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Employee;

// We shall perform DB operation with the help of DBhelper
// DAO or Data Access Object Design Pattern
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
	
	public void insertEmployee(Employee emp){
		try {
			
			// 3. Write SQL Statement
			String sql = "insert into Employee values(null, '"+emp.name+"', '"+emp.email+"', "+emp.salary+", '"+emp.address+"')";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql); //executeUpdate is used to insert/update/delete
			if(i>0){
				System.out.println(">> 4. SQL Statement Executed for "+emp.name);
			}else{
				System.out.println(">> 4. SQL Statement Execution Failed");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void saveEmployee(Employee emp){
		try {
			
			// 3. Write SQL Statement
			String sql = "insert into Employee values(null, ?, ?, ?, ?)";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, emp.name);
			stmt.setString(2, emp.email);
			stmt.setInt(3, emp.salary);
			stmt.setString(4, emp.address);
			
			int i = stmt.executeUpdate(); //executeUpdate is used to insert/update/delete
			if(i>0){
				System.out.println(">> 4. SQL Statement (I) Executed for "+emp.name);
			}else{
				System.out.println(">> 4. SQL Statement Execution Failed");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		try {
			
			// 3. Write SQL Statement
			String sql = "update Employee set name = ?, email = ?, salary = ?, address = ? where eid = ?";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, emp.name);
			stmt.setString(2, emp.email);
			stmt.setInt(3, emp.salary);
			stmt.setString(4, emp.address);
			stmt.setInt(5, emp.eid);
			
			int i = stmt.executeUpdate(); //executeUpdate is used to insert/update/delete
			if(i>0){
				System.out.println(">> 4. SQL Statement (U) Executed for "+emp.name);
			}else{
				System.out.println(">> 4. SQL Statement Execution Failed");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void deleteEmployee(int eid){
		try {
			
			// 3. Write SQL Statement
			String sql = "delete from Employee where eid = ?";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, eid);
			
			int i = stmt.executeUpdate(); //executeUpdate is used to insert/update/delete
			if(i>0){
				System.out.println(">> 4. SQL Statement (D) Executed for "+eid);
			}else{
				System.out.println(">> 4. SQL Statement Execution Failed");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public ArrayList<Employee> fetchEmployees(){
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			
			// 3. Write SQL Statement
			String sql = "select * from Employee";
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			PreparedStatement stmt = con.prepareStatement(sql);

			// ResultSet shall have the entire data of Table
			ResultSet rs = stmt.executeQuery(); // is used to fetch data from table
			
			while(rs.next()){
				Employee emp = new Employee();
				emp.eid = rs.getInt(1);
				emp.name = rs.getString(2);
				emp.email = rs.getString(3);
				emp.salary = rs.getInt(4);
				emp.address = rs.getString(5);
				//System.out.println(emp);
				
				employees.add(emp);
				
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
		
		return employees;
	}
	
	public void executeProcedure(Employee emp){
		try {
			
			// 3. Write SQL Statement
			String sql = "{ call addEmployee(?, ?, ?, ?) }"; // addEmploye is procedure in MySQL DB
			System.out.println(">> 3. SQL Statement is: "+sql);
			
			// 4. Execute SQL Statement
			CallableStatement stmt = con.prepareCall(sql);
			stmt.setString(1, emp.name);
			stmt.setString(2, emp.email);
			stmt.setInt(3, emp.salary);
			stmt.setString(4, emp.address);
			
			stmt.execute();
			System.out.println(">> Stored Procedure Executed");
			
		} catch (SQLException e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	public void processBatch(){
		try {
			
			String sql1 = "update Employee set name = 'Fenny', salary=55000 where eid = 9";
			String sql2 = "delete from Employee where empid = 2"; // is an invalid statement as no column empid exists
			
			con.setAutoCommit(false); // So that we can manually set a transaction
			
			Statement stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);

			stmt.executeBatch(); // Execute the Batch of SQL Statements
			con.commit(); 		 // Make your batch process as a transaction	
			System.out.println(">> Batch Execuetd as a Transaction");
			
		}  catch (SQLException e) {
			System.out.println(">> Some Exception:"+e);
			
			try {
				con.rollback();
				System.out.println(">> Transaction Rolled Back");
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
		}
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
