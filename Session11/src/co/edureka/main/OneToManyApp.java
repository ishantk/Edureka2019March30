package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Customer;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Address aRef1 = new Address();
		aRef1.setAdrsLine("Pristine Magnum");
		aRef1.setCity("Bengaluru");
		aRef1.setState("Karnataka");
		aRef1.setZipCode(520001);
		
		Address aRef2 = new Address();
		aRef2.setAdrsLine("Country Homes");
		aRef2.setCity("Ludhiana");
		aRef2.setState("Punjab");
		aRef2.setZipCode(141002);
		
		Address aRef3 = new Address();
		aRef3.setAdrsLine("Redwood Shores");
		aRef3.setCity("Bengaluru");
		aRef3.setState("Karnataka");
		aRef3.setZipCode(520001);
		
		Customer cRef = new Customer();
		cRef.setName("Fionna Flynn");
		cRef.setPhone("+91 77777 55555");
		cRef.setEmail("fionna@example.com");
		
		List<Address> adrsList = new ArrayList<Address>();
		adrsList.add(aRef1); // 0
		adrsList.add(aRef2); // 1
		adrsList.add(aRef3); // 2
		
		cRef.setAddresses(adrsList); // Fulfillment of 1 to many relationship
		
		
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
			
			//session.save(cRef); // Saving Customer shall also save addresses
			Customer customer = (Customer)session.get(Customer.class, 2);
			System.out.println(">> Showing Data for "+customer.getName());
			System.out.println(">> Email "+customer.getEmail()+" | Phone "+customer.getPhone());
			System.out.println("===="+customer.getName()+" Addresses==== ");
			for(Address adrs : customer.getAddresses()){
				System.out.println(">> "+adrs);
			}
			
			transaction.commit();
			
			System.out.println(">> Hibernate Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close();
		}		
		
		
		
	}

}
