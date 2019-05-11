package co.edureka;

interface State{
	String fetchState();
}

class Ordered implements State{
	
	public String fetchState() {
		return "ORDERED STATE";
	}
}

class Shipped implements State{
	
	public String fetchState() {
		return "SHIPPED STATE";
	}
}

class Delivered implements State{
	
	public String fetchState() {
		return "DELIVERED STATE";
	}
}

public class Product {

	State state;
	
	void changeState(State state){
		this.state = state;
	}
	
	void showState(){
		System.out.println("Product is in : "+state.fetchState());
	}
	
}
