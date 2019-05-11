package co.edureka;

public class Ride {
	
	// Attributes for Ride
	boolean driverAvailability;
	int paymentMethod;
	int price;
	int distance;

	public Ride() {
		System.out.println(">> Ride Object Constructed");
	}

	public boolean isDriverAvailability() {
		return driverAvailability;
	}

	public void setDriverAvailability(boolean driverAvailability) {
		this.driverAvailability = driverAvailability;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	// Business Method
	public void bookRide(String source, String destinition){
		System.out.println("=====================================");
		if(driverAvailability){
			System.out.println(">> Cab Booked from "+source+" to "+destinition);
			System.out.println(">> Driver Details Shall be Shared Soon !!");
		}
		System.out.println("=====================================");
		
	}
	

	@Override
	public String toString() {
		return "Ride [driverAvailability=" + driverAvailability + ", paymentMethod=" + paymentMethod + ", price="
				+ price + ", distance=" + distance + "]";
	}
	
}
