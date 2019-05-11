package co.edureka;

interface FoodItem{
	String desription();
	int price();
}

class VeggieBurger implements FoodItem{
	
	public String desription() {
		String desc = "Indian Masala Veggie Burger";
		return desc;
	}
	
	public int price() {
		return 100;
	}
}

abstract class FoodDecorator implements FoodItem{
	
	FoodItem item; // HAS-A Relation
	
	FoodDecorator(FoodItem item){
		this.item = item;
	}

	public String desription() {
		return item.desription();
	}
	
	public int price() {
		return item.price();
	}
	
}

class VeggieBurgerMeal extends FoodDecorator{
	
	VeggieBurgerMeal(FoodItem item){
		super(item);
	}

	public String desription() {
		return item.desription()+" With Fries and Coke";
	}
	
	public int price() {
		return item.price()+100;
	}
	
}
