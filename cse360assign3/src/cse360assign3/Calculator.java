/**
 * @author Cheri Thompson
 * @version 2/19/2016
 */

package cse360assign3;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** getTotal returns the total value.
	 * 
	 * @return total 	the integer total.
	 */
	public int getTotal () {
		return total;
	}
	
	/** Add the parameter to the total variable.
	 * 
	 * @param value 	an integer number.
	 */
	public void add (int value) {
		total += value;
	}
	
	/** Subtract the parameter from the total variable.
	 * 
	 *@param value 	an integer number.
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/** Multiply the parameter with itself and the parameter.
	 *
	 *@param value an integer number.
	 */
	public void multiply (int value) {
		total = total*total*value;
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
	}
	
	/** getHistory returns an empty string.
	 * 
	 *@return an empty string.
	 */
	public String getHistory () {
		return "";
	}
}