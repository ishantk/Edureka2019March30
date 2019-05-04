package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee eRef1 = new Employee(null, "Daisy", "daisy@example.com", 32, 33000);
		Employee eRef2 = new Employee(null, "Jack", "jack@example.com", 26, 27000);
		
		//System.out.println(">> eRef1 details: "+eRef1);
		//System.out.println(">> eRef2 details: "+eRef2);
		
		// Challenge : Data in Object is temporarily available
		// Save Data permanently in DataBase : Use Hibernate
		/*
		 	1. Link the Jar files for Hibernate and MySQL DB (Type4 Driver)
		 	2. Copy hibernate.cfg.xml file into src directory and edit it (Information for Database Connections)
		 	3. Copy anyname.hbm.xml file into src directory and edit it	  (Information for Mapping Object with Table)
		 	4. To Write and execute Hibernate Code in main class
		 */
		
		
		//Configuration config = null;
		AnnotationConfiguration config = null; // if we are using annotations instead of xml mapping
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			
			//config = new Configuration();
			config = new AnnotationConfiguration();
			config.configure(); // Parse hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Create Connection with Database
			
			transaction = session.beginTransaction();
			
			//1. Insert Data in Database
			//session.save(eRef1);
			//session.save(eRef2);
			
			//2. Get Data from DataBase
			//Employee emp = (Employee)session.get(Employee.class, 3);
			//System.out.println(emp);
			
			//2.1 Fetch all Records
			//String hql = "From Employee"; // We have HQL just like SQL
			/*String hql = "From Employee where salary > 25000"; // We have HQL just like SQL
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee e : employees){
				System.out.println(e);
			}*/
			
			// If you do not wish to explore HQL we can use an API called Criteria to fetch all records
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 25000));
			
			List<Employee> employees = criteria.list();
			for(Employee e : employees){
				System.out.println(e);
			}*/
			
			//3. Update Object in Database
			/*Employee emp = (Employee)session.get(Employee.class, 1);
			emp.setName("John Watson");
			emp.setEmail("john.watson@example.com");
			emp.setSalary(89000);
			
			session.update(emp);*/
			
			//4. Delete Record from Database
			/*Employee emp = new Employee();
			emp.setEid(1);
			
			session.delete(emp);*/
			
			// We shall create 100 objects and save them in session
			/*for(int i=1;i<=100;i++){
				Employee e = new Employee(null, "Employee"+i, "emp."+i+"@example.com", 30, 30000+i);
				session.save(e);
			}*/
			
			transaction.commit();
			
			System.out.println(">> Hibernate Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close();
		}
		

	}

}
