/**
 * @author Cheri Thompson
 * @version 2/21/2016
 */

package cse360assign3;

public class Calculator {

	private int total;
	//used for keeping track of the history for the getHistory method
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	/** getTotal returns the total value.
	 * 
	 * @return total 	the integer total.
	 */
	public int getTotal () {
		
		history += "Total: " + total + " ";
		
		return total;
	}
	
	/** Add the parameter to the total variable.
	 * 
	 * @param value 	an integer number.
	 */
	public void add (int value) {
		total += value;
		history += "+ " + value + " ";
	}
	
	/** Subtract the parameter from the total variable.
	 * 
	 *@param value 	an integer number.
	 */
	public void subtract (int value) {
		total -= value;
		history += "- " + value + " ";
	}
	
	/** Multiply the parameter with itself and the parameter.
	 *
	 *@param value an integer number.
	 */
	public void multiply (int value) {
		total = total*value;
		history += "* " + value + " ";
	}
	
	/** Divide the total by the parameter with integer division.
	 * If the parameter is zero, the total is set to zero.
	 * 
	 *@param value	an integer number.
	 */
	public void divide (int value) {
		if (value != 0)
		{
			total /= value;
		}
		else
		{
			total = 0;
		}
		
		history += "/ " + value + " ";
	}
	
	/** getHistory returns the history of operations performed and values stored.
	 * 
	 *@return history	a string that contains all the functionality previously called by the user.
	 */
	public String getHistory () {
		return history;
	}
}