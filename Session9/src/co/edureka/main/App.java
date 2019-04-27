package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.DBHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee eRef1 = new Employee(0, "Fionna", "fionna@example.com", 76520, "Country Homes");
		System.out.println(eRef1);		
		
		// 1. Load the Driver
		DBHelper db = new DBHelper(); // Object of DBHelper used to perform DB operations (DAO)
		
		// 2. Create Connection with Database
		db.createConnection();
				
		// 3. 4. Write and Execute SQL Statement
		//db.insertEmployee(eRef1);
		//db.saveEmployee(eRef1);
		
		//db.updateEmployee(eRef1);
		
		//db.deleteEmployee(3);
		/*ArrayList<Employee> empList = db.fetchEmployees();
		System.out.println("*********************************************");
		for(Employee emp : empList){
			System.out.println(">> "+emp);
		}
		System.out.println("*********************************************");
		*/
		
		//db.executeProcedure(eRef1);
		
		db.processBatch();
		
		//5. Close Connection
		db.closeConnection();
		

	}

}
