package co.edureka.model;

public class VegetarianDish extends Dish{

	String nutrients;
	Integer quantity;
	
	public String getNutrients() {
		return nutrients;
	}
	public void setNutrients(String nutrients) {
		this.nutrients = nutrients;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "VegetarianDish [nutrients=" + nutrients + ", quantity=" + quantity + "]";
	}
	
	
	
}
