/**
 * @author: Alexander Seiler
 * @matr.-nr.: 11771276
 * 17.03.2019
 * @description: this file acts as the entry point to the project
 * @filename: configurator.java
 */

public class configurator {

	/**
	 * @author: Alexander
	 * @description: main method
	 * @param args
	 */
	public static void main(String[] args) {
		// create pcb
		pcb board = new pcb();
		// create several components
		capacitor cap1 = new capacitor("Cap1", 10, 30);
		resistor res1 = new resistor("Res1", 1, 100);
		// 0.3F, F necessary otherwise the compiler would think to use the number as a double
		capacitor cap2 = new capacitor("Cap2", 0.3F, 0.0003F);
		// add them
		board.placeComponent(cap1);
		board.placeComponent(cap2);
		board.placeComponent(res1);
		// create connections between added elements
		board.connectComponents(res1, cap1);
		board.connectComponents(res1, cap2);
		board.connectComponents(cap1, cap2);
		// create connection and add elements from outside
		capacitor cap3 = new capacitor("Cap3", 1, 30000);
		resistor res2 = new resistor("Res2", 1000, 30010239);
		circuitPath con = new circuitPath(cap3, res2);
		// add connection to the pcb
		board.addConnection(con);
		// print the whole pcb
		board.showConnectionDetails();
		// get the sum and print it
		System.out.println("Sum: " + board.calculatePrice());
		System.out.println("Sum aggregated at runtime: " + board.getSum());
	}

}
