package co.edureka;

interface Plan{
	void setPlan();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void setPlan() {
		data = 5;
		price = 200;
	}
	
	public void showPlan() {
		System.out.println(">> Plan2G offers "+data+" GB of data at \u20b9"+price);
	}
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void setPlan() {
		data = 10;
		price = 300;
	}
	
	public void showPlan() {
		System.out.println(">> Plan3G offers "+data+" GB of data at \u20b9"+price);
	}
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void setPlan() {
		data = 20;
		price = 500;
	}
	
	public void showPlan() {
		System.out.println(">> Plan4G offers "+data+" GB of data at \u20b9"+price);
	}
}

public class PlanFactory {

	public static Plan getPlan(int type){
		
		Plan planRef = null;
		
		switch (type) {
			case 2:
				planRef = new Plan2G();
				break;
				
			case 3:
				planRef = new Plan3G();
				break;
				
			case 4:
				planRef = new Plan4G();
				break;
		}
		planRef.setPlan();
		return planRef;
		
	}
	
}
