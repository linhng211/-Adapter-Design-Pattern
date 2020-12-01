/**
 * 
 * @author Linh Nguyen
 * This class contains all the instances of shoe
 */
public class Shoe implements ShoeListing {
	private String brand;
	private String name;
	private double cost;
	private String description;
	/**
	 * constructor set up all the attributes of the shoe
	 * @param brand
	 * @param name
	 * @param price
	 * @param description
	 */
	public Shoe(String brand, String name, double price, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}
	/**
	 * print all the attributes of the shoe
	 * @return String name + brand + description + cost
	 */
	public String toString() {
		return "Shoe: " + name + "By: " + brand + "Details: " + description+"Cost: $"+cost; 
	}
}
