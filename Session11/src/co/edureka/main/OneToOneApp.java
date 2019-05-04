package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Manager;
import co.edureka.model.Project;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.setName("George");
		manager.setDepartment("Research");
		
		Project project = new Project();
		project.setName("Celox");
		project.setTechnology("Android");
		
		// Manager Object has a ref var which points to the Project Object 
		manager.setProject(project); // HAS-A Relationship Fulfillment
		project.setManager(manager); // HAS-A Relationship Fulfillment
		
		// How we can save data
		System.out.println(">> Manager Details: "+manager);
		System.out.println(">> Project Details: "+project);
		
		// We shall create 2 tables
		// Table 1 shall be Manager Table and Table 2 shall be Project Table
		// mid = pid | if mid = 1, we will have pid = 1 
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			
			config = new Configuration();
			config.configure(); // Parse hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Create Connection with Database
			
			transaction = session.beginTransaction();
			
			session.save(manager); // Saving Manager shall also save Project :)
			
			transaction.commit();
			
			System.out.println(">> Hibernate Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close();
		}

	}

}
