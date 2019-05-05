package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Cake;
import co.edureka.model.Dish;
import co.edureka.model.VegetarianDish;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Dish dish = new Dish();
		dish.setName("Burger");
		dish.setDescription("A Mint Chilli Burger with Fries");
		dish.setPrice(100);
		
		VegetarianDish veggieDish = new VegetarianDish();
		veggieDish.setName("Green Salad");
		veggieDish.setDescription("Frsh Green Salad with Sweet Onion Dressing");
		veggieDish.setPrice(200);
		veggieDish.setNutrients("Proteins, Carbs etc..");
		veggieDish.setQuantity(2);
		
		Cake cake = new Cake();
		cake.setName("Choco Lava Cake");
		cake.setDescription("Melted Chocolate in The Cake");
		cake.setPrice(500);
		cake.setNutrients("Fats, Carbs etc...");
		cake.setQuantity(1);
		cake.setFlavour("Chocolate");
		cake.setWeight(1);
		
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
			
			session.save(dish);
			session.save(veggieDish);
			session.save(cake);
			
			transaction.commit();
			
			System.out.println(">> Hibernate Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close();
		}		

	}

}
