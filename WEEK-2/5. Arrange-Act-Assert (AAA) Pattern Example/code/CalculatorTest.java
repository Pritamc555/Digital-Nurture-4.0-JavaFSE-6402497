import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		System.out.println("Setup Before Test");
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() {
		System.out.println("Cleanup after test");
		calculator = null;
	}
	
	@Test
	public void testAdd() {
		int result = calculator.add(10, 5);
		
		assertEquals(15, result);
	}
	
	@Test
	public void testSub() {
		int result = calculator.subtract(10, 5);
		
		assertEquals(5, result);
	}
	
	@Test
	public void testMul() {
		int result = calculator.multiply(10, 5);
		
		assertEquals(50, result);
	}
	
	@Test
	public void testDiv() {
		int result = calculator.divide(10, 5);
		
		assertEquals(2, result);
	}



	
	}


