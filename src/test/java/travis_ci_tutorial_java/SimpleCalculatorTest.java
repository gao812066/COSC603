package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus( 5, 3), 2);
	}
	@Test
	public void testMulpty() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mulpty( 5, 3), 15);
	}
	@Test
	public void testDele() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.dele( 6, 3), 2);
	}
}
