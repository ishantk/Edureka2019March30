
public class Conditions {

	public static void main(String[] args) {
		
		//int fare = 100;
		
		// Conditions Testing : Validating the Rules of our Logic
		// if/else
		/*if(fare >=200){
			int discount = (10*300)/100;
			int actualFare = fare - discount;
			System.out.println("\u20b9"+discount+" Discount is offered on a Fare of \u20b9"+fare);
			System.out.println("Please pay \u20b9"+actualFare+" to book the cab");
		}else{
			System.out.println("Please pay \u20b9"+fare+" to book the cab");
		}*/
		
		
		// Ladder if/else
		
		int fare = 1200;
		int discount = 0;
		int actualFare = 0;
		
		if(fare >= 200 && fare < 500){
			discount = (10*fare)/100;
		}else if(fare >= 500 && fare < 1000){
			discount = (20*fare)/100;
		}else if(fare >= 1000){
			discount = (30*fare)/100;
		}else{
			discount = 0;
		}
		
		actualFare = fare - discount;
		System.out.println("\u20b9"+discount+" Discount is offered on a Fare of \u20b9"+fare);
		System.out.println("Please pay \u20b9"+actualFare+" to book the cab");
		
		// Nested if/else | if/else within the if/else
		
		boolean isInternetOn = false;
		boolean isGPSOn = true;
		
		if(isInternetOn){
			System.out.println(">> You can use Google Maps");
			if(isGPSOn){
				System.out.println(">> You can Navigate using Google Maps");
			}else{
				System.out.println(">> Please Enable GPS and Try Again");
			}
		}else{
			System.out.println(">> Please connect to Internet and Try Again");
		}
	
		// switch case : Explore this !! :)
		
	}

}
