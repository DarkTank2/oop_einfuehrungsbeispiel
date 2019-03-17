/**
 * @author: Alexander Seiler
 * @matr.-nr.: 11771276
 * 17.03.2019
 * @description: this file holds the general definition of the class
 * 	resistor which is a subclass of hardwareComponent
 * @filename: resistor.java
 */

public class resistor extends hardwareComponent {
	// class for an resistor, is a subclass of a hardware component
	// attributes:
	// 	@resistorValue: float: holds the capacity of the instance
	
	// methods:
	// 	@constructor
	// 	@setResistorValue: set the capacity
	// 	@getResistorValue: gets the capacity
	
	// attributes:
	private float resistorValue = 0;
	
	
	// methods:
	/**
	 * @author: Alexander
	 * @description: Constructor for class resistor.java
	 * @param name, String the id of the instance to initialize with
	 * @param price, Float the price of the instance to initialize with
	 * @param resistorValue, Float the initial value of the resistance of the instance to be initialized with
	 */
	public resistor(String name, float price, float resistorValue) {
		super(name, price);
		this.resistorValue = resistorValue;
	}


	/**
	 * @author: Alexander
	 * @description: Getter-method for resistorValue
	 * @return the resistorValue
	 */
	public float getResistorValue() {
		return resistorValue;
	}


	/**
	 * @author: Alexander
	 * @description: Setter-method for resistorValue
	 * @param resistorValue the resistorValue to set
	 */
	public void setResistorValue(float resistorValue) {
		this.resistorValue = resistorValue;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "R = " + this.getResistorValue() + "Ohm with ID: " + this.getId();
	}
}
