/**
 * 
 * @author Linh Nguyen
 *	A list of products in the store
 */
public class Product implements ProductListing {
	private String title;
	private double price;
	private String description;
	/**
	 * Constructor set up all the attributes of the product 
	 * @param title
	 * @param price
	 * @param description
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	/**
	 * return the title of the product
	 * @return String title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * return the price of the product
	 * @return double price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * return the description of the product
	 * @return String description
	 */
	public String getDescription() {
		return description;
	}
}
