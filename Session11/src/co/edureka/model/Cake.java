package co.edureka.model;

public class Cake extends VegetarianDish{

	String flavour;
	Integer weight;
	
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", weight=" + weight + "]";
	}
	
	
	
}
