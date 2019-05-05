package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Customer;

public class DIApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Customer cRef = context.getBean("customer",Customer.class);
		System.out.println(cRef);
		System.out.println(cRef.getDish().getName()+" has below sauces:");
		System.out.println(cRef.getSauces());

	}

}
