package co.edureka;

//import org.springframework.aop.framework.ProxyFactoryBean; -> Configure this API in xml file
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Ride ride = context.getBean("rideProxy",Ride.class);
		//System.out.println(ride);

		ride.bookRide("Pristine Magnum", "Redwood Shores");
		
		// Till Here Advices are not getting executed. 
		// We need to configure an API ProxyFactorBean in beans.xml file to make them work
		
		
	}

}
