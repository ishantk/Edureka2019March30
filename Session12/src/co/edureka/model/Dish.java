package co.edureka.model;

public class Dish {

	String name;
	String description;
	Integer price;
	
	public Dish() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
}
