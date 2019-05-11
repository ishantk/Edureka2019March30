package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//Shall be executed after business methods
public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println(">> After Advice for "+method.getName());
		
		if(method.getName().equals("bookRide")){
			
			// Access the Object in memory and disable availabilty :)
			Ride ride = (Ride)beanRef; // Get the Reference to Ride Object
			
			// Checking For Drivers
			if(ride.driverAvailability){
				System.out.println(">> Driver John shall be available to pick you from "+inputs[0]);
				System.out.println(">> Please pay "+ride.price+" for "+ride.distance+" kms using your payment method as "+ride.paymentMethod);
			}			
		}
	}

}
