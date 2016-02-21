/**
 * @author Cheri Thompson
 * @version 2/21/2016
 */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	/**
	 * Test method for {@link cse360assign3.Calculator#Calculator()}.
	 * Tests the constructor.
	 */
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertTrue("Calculator object should exist now", calc != null);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getTotal()}.
	 * Tests whether the returned total is correct.
	 */
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(calc.getTotal(), 0);
		calc.add(2);
		assertEquals(calc.getTotal(), 2);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#add(int)}.
	 * Tests whether the add method adds.
	 */
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(3);
		assertEquals(calc.getTotal(), 3);
		calc.add(5);
		assertEquals(calc.getTotal(), 8);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#subtract(int)}.
	 * Tests whether the subtract method subtracts.
	 */
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(3);
		assertEquals(calc.getTotal(), -3);
		calc.subtract(1);
		assertEquals(calc.getTotal(), -4);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#multiply(int)}.
	 * Test whether the multiply method multiplies the total by the value.
	 */
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.multiply(3);
		assertEquals(calc.getTotal(), 0);
		calc.add(3);
		calc.multiply(2);
		assertEquals(calc.getTotal(), 3*2);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#divide(int)}.
	 * Test whether the divide method divides.
	 * Also checks if it correctly handles a divide by 0. 
	 */
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(calc.getTotal(), 0);
		calc.add(4);
		calc.divide(2);
		assertEquals(calc.getTotal(), 2);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getHistory()}.
	 * Tests whether the history of each method is added to the string.
	 */
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		assertEquals(calc.getHistory(), "0 ");
		calc.add(3);
		assertEquals(calc.getHistory(), "0 + 3 ");
		calc.subtract(2);
		assertEquals(calc.getHistory(), "0 + 3 - 2 ");
		calc.divide(3);
		assertEquals(calc.getHistory(), "0 + 3 - 2 / 3 ");
		calc.multiply(2);
		assertEquals(calc.getHistory(), "0 + 3 - 2 / 3 * 2 ");
		calc.getTotal();
		assertEquals(calc.getHistory(), "0 + 3 - 2 / 3 * 2 Total: 0 ");
	}

}
