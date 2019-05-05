package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Connection;

public class App {

	public static void main(String[] args) {
		
		/*Connection c1 = new Connection();
		c1.setUrl("jdbc:mysql://localhost");
		c1.setDbName("edureka");
		c1.setUsername("john@example.com");
		c1.setPassword("pass123");
		
		Connection c2 = new Connection("jdbc:mysql://localhost", "mydb", "fionna@abc.com", "fionna@123");
		
		System.out.println(">> c1 is: "+c1);
		System.out.println(">> c2 is: "+c2);*/
		
		// Challenge:
		// If any configuration has to be modified we need to change in source code
		// Assuming we have our software running in client's machine and we have to update db details 
		// We need to change or edit our .java i.e. source file, recompile and re distribute the same software to client
		
		// Once we manipulate source and re create SW with another version, clients have to update it
		
		// Spring FW:
		// You dont create objects, rather configure objects in XML File..
		// Spring FW's IOC Container will read XML file and create and manage objects on our behalf
		// thus way if any change comes you just edit your xml file and SW will not be released again
		
		// Spring IOC
		// 1. Link all the Spring Core Jar Files
		// 2. Copy xml file and configure Object with data in XMl file
		// 3. In main method create IOC Container and do Inversion of Control
		
		// 1. Inversion of Control - BeanFactory IOC Container
		//Resource resource = new ClassPathResource("beans.xml"); // Read XML File
		//BeanFactory factory = new XmlBeanFactory(resource);		// IOC Container to create and manage objects in memory
		
		// We are not creating object, we are obtaining reference to the object
		/*Connection cRef1 = (Connection)factory.getBean("con1");
		Connection cRef2 = factory.getBean("con2", Connection.class);
		
		System.out.println("cRef1 is: "+cRef1);
		System.out.println("cRef2 is: "+cRef2);*/
		
		// BeanFactory IOC Container will create objects only when we request for them :)
		
		// 1. Inversion of Control - ApplicationContext IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// ApplicationContext IOC Container will create objects before hand :)
		
		Connection cRef1 = (Connection)context.getBean("con1");
		//Connection cRef2 = context.getBean("con2", Connection.class);
		
		// Re-Requesting Reference for con1
		//Connection cRef3 = (Connection)context.getBean("con1");
		
		System.out.println("cRef1 is: "+cRef1);
		//System.out.println("cRef2 is: "+cRef2);
		//System.out.println("cRef3 is: "+cRef3);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		

	}

}
