/**
 * @author: Alexander Seiler
 * @matr.-nr.: 11771276
 * 17.03.2019
 * @description: this file holds the general definition of the class
 * 	cicuitPath, which acts like a connection between two different hardwareComponents
 * @filename: circuitPath.java
 */

public class circuitPath {
	
	// private attributes for each hardware-component the circuitPath connects
	private hardwareComponent hwComponent1 = null;
	private hardwareComponent hwComponent2 = null;
	
	
	/**
	 * @author: Alexander
	 * @description: Constructor for class circuitPath.java
	 * @param hwComponent1
	 * @param hwComponent2
	 */
	public circuitPath(hardwareComponent hwComponent1, hardwareComponent hwComponent2) {
		this.hwComponent1 = hwComponent1;
		this.hwComponent2 = hwComponent2;
	}


	/**
	 * @author: Alexander
	 * @description: Getter-method for hwComponent1
	 * @return the hwComponent1
	 */
	public hardwareComponent getHwComponent1() {
		return hwComponent1;
	}


	/**
	 * @author: Alexander
	 * @description: Setter-method for hwComponent1
	 * @param hwComponent1 the hwComponent1 to set
	 */
	public void setHwComponent1(hardwareComponent hwComponent1) {
		this.hwComponent1 = hwComponent1;
	}


	/**
	 * @author: Alexander
	 * @description: Getter-method for hwComponent2
	 * @return the hwComponent2
	 */
	public hardwareComponent getHwComponent2() {
		return hwComponent2;
	}


	/**
	 * @author: Alexander
	 * @description: Setter-method for hwComponent2
	 * @param hwComponent2 the hwComponent2 to set
	 */
	public void setHwComponent2(hardwareComponent hwComponent2) {
		this.hwComponent2 = hwComponent2;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.hwComponent1.toString() + " <-- connected --> " + this.hwComponent2.toString();
	}
}
