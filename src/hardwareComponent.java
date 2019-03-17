/**
 * @author: Alexander Seiler
 * @matr.-nr.: 11771276
 * 17.03.2019
 * @description: This file holds the general definitions
 * 	of the class hardwareComponent 
 * 	including it's attributes, methods and constructor
 * @filename: hardwareComponent.java
 */

abstract class hardwareComponent {
	// abstract class for the hardware object
	// attributes:
	// 	@price: float, specify the price
	// 	@id: string: holds an identifier
	
	// methods:
	// 	@constructor
	// 	@setPrice: set the price
	// 	@getPrice: gets the price
	// 	@setId: set the price
	// 	@getId: gets the price
	
	// attributes:
	private String id = "";
	private float price = 0;
	
	// methods:
	/**
	 * @author Alexander
	 * @description Constructor for instances of this class
	 * @param name: String to initialize the id of the instance with
	 * @param price: Float to initialize the price of the instance with
	 * @return void
	 * @
	 * */
	public hardwareComponent(String name, float price) {
		this.id = name == "" ? "-" : name;
		this.price = price;
	}
	
	/**
	 * @author Alexander
	 * @description Setter for attribute price of an instance
	 * @param newPrice: Float, value to set the price of the instance to
	 * @return void
	 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}
	
	/**
	 * @author Alexander
	 * @description Getter for the attribute price of an instance
	 * @return Float, the price of the instance
	 */
	public float getPrice() {
		return this.price;
	}
	
	/**
	 * @author Alexander
	 * @description Setter for attribute id of an instance
	 * @param newName: String
	 * @return void
	 */
	public void setId(String newName) {
		this.id = newName;
	}
	
	/**
	 * @author Alexander
	 * @description Getter for attribute id of an instance
	 * @return String, the ID of the instance
	 */
	public String getId() {
		return this.id;
	}
}