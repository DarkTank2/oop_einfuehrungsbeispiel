/**
 * @author: Alexander Seiler
 * @matr.-nr.: 11771276
 * 17.03.2019
 * @description: this file holds the general definition of the class
 * 	capacitor which is a subclass of hardwareComponent
 * @filename: capacitor.java
 */

public class capacitor extends hardwareComponent {
	// class for an capacitor, is a subclass of a hardware component
	// attributes:
	// 	@capacitorValue: float: holds the capacity of the instance
	
	// methods:
	// 	@constructor
	// 	@setCapacitorValue: set the capacity
	// 	@getCapacitorValue: gets the capacity
	
	// attributes:
	// -1 means short circuited, e.g. capacity is infinity
	private float capacitorValue = -1;
	
	// methods:
	/**
	 * @author: Alexander
	 * @description: Constructor for an instance of capacitor
	 * @param name, String the id of the instance is initialized with
	 * @param price, Float the price of the instance is initialized with
	 * @param initialValue, Float the capacity of the instance is initialized with
	 */
	public capacitor(String name, float price, float initialValue) {
		super(name, price);
		this.capacitorValue = initialValue;
	}

	/**
	 * @author: Alexander
	 * @description: Getter-method for capacitorValue
	 * @return the capacitorValue
	 */
	public float getCapacitorValue() {
		return capacitorValue;
	}

	/**
	 * @author: Alexander
	 * @description: Setter-method for capacitorValue
	 * @param capacitorValue the capacitorValue to set
	 */
	public void setCapacitorValue(float capacitorValue) {
		this.capacitorValue = capacitorValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "C = " + this.getCapacitorValue() + "F with ID: " + this.getId();
	}
}