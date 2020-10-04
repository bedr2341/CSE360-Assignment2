package cse360assignment02;

public class AddingMachine {
	private int total;
	private String log;

	/**
	 * Constructs an instance of the AddingMachine class and instnatiates the variable total to 0 and the log to "0"
	 */
	public AddingMachine() {
		this.total = 0;  // not needed - included for clarity
		this.log = "0";
	}

	/**
	 * @return the value of total
	 */
	public int getTotal() {
		return this.total;
	}

	/**
	 * Adds the parameter to the total variable
	 * Updates the transaction
	 * @param value is added to total
	 */
	public void add(int value) {
		this.total += value;
		this.log += " + ";
		this.log += value;
	}

	/**
	 * Subtracts the parameter from the total variable
	 * Updates the transaction
	 * @param value is subtracted from total
	 */
	public void subtract(int value) {
		this.total -= value;
		this.log += " - ";
		this.log += value;
	}

	/**
	 * @return A history of the transactions
	 */
	public String toString() {
		return this.log;
	}

	/**
	 * Resets the value of total and log
	 */
	public void clear() {
		this.total = 0;
		this.log = "0";
	}
}