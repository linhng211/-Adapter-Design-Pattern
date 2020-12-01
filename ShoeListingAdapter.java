/**
 * 
 * @author Linh Nguyen
 * This class adapt a list of shoes into a list of products of the store
 *
 */
public class ShoeListingAdapter implements ProductListing {
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	/**
	 * Constructor, reset all the attributes of the shoe by calling the toString method of the shoe class
	 * @param shoe
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
		this.title = shoe.toString().substring(shoe.toString().indexOf("Shoe:") + 6, shoe.toString().indexOf("By:"));
		this.brand = shoe.toString().substring(shoe.toString().indexOf("By:") + 4, shoe.toString().indexOf("Details:"));
		this.price = Double.valueOf(shoe.toString().substring(shoe.toString().indexOf("$") + 1));
		this.description = shoe.toString().substring(shoe.toString().indexOf("Details:") + 9, shoe.toString().indexOf("Cost:"));
	}
	/**
	 * return the title of the shoe
	 * @return String title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * return the price of the shoe
	 * @return double price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * return the description of the shoe included its brand
	 * @return String brand + description 
	 */
	public String getDescription() {
		return "Created by " + brand + ", " + description;
	} 
}
