package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator_test_case {

	@Test
	public void testSum() {

		System.out.println("sum");

		Integer x = 15;

		Integer y = 15;

		Integer expResult = 30;

		Integer result = Calculator.sum(x, y);

		assertEquals(expResult, result);

		assertEquals(null, Calculator.sum(15, null));

		assertEquals(null, Calculator.sum(null, 15));

		assertEquals(null, Calculator.sum(null, null));

		}

}
