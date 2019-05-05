package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Dish;
import co.edureka.model.VegetarianDish;

public class Inheritance {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		
		//Dish dRef = context.getBean("dish", Dish.class);
		//System.out.println(">> "+dRef);
		
		VegetarianDish vRef = context.getBean("veggie", VegetarianDish.class);
		System.out.println(">> "+vRef);

	}

}
