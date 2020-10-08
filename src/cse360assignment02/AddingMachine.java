package cse360assignment02;
/**
* The Adding Machine class has several methods 
* that model basic operations.
* @author  Sanjeev Ganga Raju
* @version 2.0
* @since   2020-10-07
*/
public class AddingMachine {
	private int total;
	private String transHistory = "0 ";
	/**
	 * This is the class constructor
	 */
	public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	}
	/**
	 * getTotal returns value of total
	 * @return current value of "total" after operations
	 */
	public int getTotal () {
	    return total;
	}
	/**
	 * add method adds values and updates history
	 * @param value that needs to be added to total
	 */
	public void add (int value) {
		total += value;
		transHistory += "+ " + value + " ";
	}
	/**
	 * subtract method subtracts values
	 * @param value that needs to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		transHistory += "- " + value + " ";
	}
	/**
	 * toString method returns string type of result
	 * @return the history of transactions as a String
	 */
	public String toString () {
	    return transHistory;
	}
	/**
	 * clear method resets value of total and transHistory
	 */
	public void clear() {
		total = 0;
		transHistory = "0 ";
	}
}
