package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Shall be executed before business methods
public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println(">> Before Advice for "+method.getName());
		
		if(method.getName().equals("bookRide")){
			
			// Checking For Drivers
			if(Util.driverCount > 0){
				System.out.println(">> Driver Available for "+inputs[0]+" to "+inputs[1]);
			}else{
				System.out.println(">> No Driver Available for "+inputs[0]+" to "+inputs[1]);
				
				// Access the Object in memory and disable availabilty :)
				Ride ride = (Ride)beanRef; // Get the Reference to Ride Object
				ride.driverAvailability = false;
			}
			
		}
	}

}
