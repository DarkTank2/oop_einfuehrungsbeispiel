import java.util.Vector;

/**
 * @author: Alexander Seiler
 * @matr.-nr.: 11771276
 * 17.03.2019
 * @description: this file holds the general definition for the class
 * 	pcb, which acts as board to hold several hardwareComponents connected via circuitPath(s)
 * 	it also handles the connections and the components
 * @filename: pcb.java
 */

public class pcb {
	
	private Vector<hardwareComponent> hwComponents = null;
	private Vector<circuitPath> connections = null;
	private double sum = 0;
	
	
	/**
	 * @author: Alexander
	 * @description: Constructor for class pcb.java
	 */
	public pcb() {
		this.hwComponents = new Vector<hardwareComponent>();
		this.connections = new Vector<circuitPath>();
	}
	
	/**
	 * @author: Alexander
	 * @description: this method adds the passed hardwareComponent to the pcb
	 * @param hw
	 * @return boolean, true if the component got added successfully or the component is already on the board, false if the component is null
	 */
	boolean placeComponent(hardwareComponent hw) {
		// check if hwComponent is valid (!= null)
		if(hw == null) {
			return false;
		}
		// check if component is already on board?!
		if(!this.hwComponents.contains(hw)) {
			// push it on hwComponents vector since it does not appear to be on it
			this.hwComponents.add(hw);
			this.sum += hw.getPrice();
		}
		return true;
	}
	
	/**
	 * @author: Alexander
	 * @description: this method connects two hardwareComponents that are on the board
	 * @param hw1, first hardwareComponent
	 * @param hw2, second hardwareComponent
	 * @return boolean, true if succeeded, false if error occurred
	 */
	boolean connectComponents(hardwareComponent hw1, hardwareComponent hw2) {
		// check if both component are on the board
		if(hw1 == null || hw2 == null) {
			// at least one component is not defined
			return false;
		}
		if(!this.hwComponents.contains(hw1) || !this.hwComponents.contains(hw2)) {
			// at least one component is not on the board
			return false;
		}
		// create new connection with both elements
		circuitPath connection = new circuitPath(hw1, hw2);
		// add it to the vector
		this.connections.add(connection);
		return true;
	}
	
	/**
	 * @author: Alexander
	 * @description: this method adds an already existing connection, plus it's two corresponding hardwareComponents
	 * @param connection, the connection to be added
	 * @return boolean, true if succeeded, false if failed
	 */
	boolean addConnection(circuitPath connection) {
		// check for valid connection (!= null)
		if(connection == null) {
			return false;
		}
		// check both hardwareComponents for validity
		if(connection.getHwComponent1() == null || connection.getHwComponent2() == null) {
			return false;
		}
		// add hardwareComponents from connection to this instance
		this.placeComponent(connection.getHwComponent1());
		this.placeComponent(connection.getHwComponent2());
		// add connection to this instance
		this.connections.add(connection);
		return true;
	}
	
	/**
	 * @author: Alexander
	 * @description: this method sums up every hardwareComponent by price
	 * @return double, the accumulated price for the pcb's parts
	 */
	double calculatePrice() {
		// initializing the sum
		double sum = 0;
		// mapping every element of the hardwareComponents to its price and summing them all up
		sum = this.hwComponents.stream()
			.mapToDouble(element -> element.getPrice())
			.sum();
		// returning the sum
		return sum;
	}
	
	/**
	 * @author: Alexander
	 * @description: this method prints the whole pcb information regarding the connections
	 */
	public void showConnectionDetails() {
		this.connections.forEach(element -> System.out.println(element.toString()));
	}

	/**
	 * @author: darkt
	 * @description: Getter-method for attribute sum
	 * @return the sum
	 */
	public double getSum() {
		return sum;
	}
}
