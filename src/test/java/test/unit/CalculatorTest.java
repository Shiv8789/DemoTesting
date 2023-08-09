package test.unit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import app.Calculator;
import app.CalculatorService;

public class CalculatorTest {
	
	Calculator calc;
	CalculatorService service;
	@Before
	public void setUp() {
		// mock method will create a mock object for calculator service 
		 service=Mockito.mock(CalculatorService.class);
		 calc=new Calculator(service);
	}

	
	@Test
	public void testPercentage() {
		int expected=100;
		//Method stub
		//When a method x() is called return me result y
		// This will not call the  actual method, but will return a dummy output
		when(service.multiply(200, 50)).thenReturn(10000);
		int actual=calc.getPercentage(200, 50);
		assertEquals(expected,actual);
	}
	@Test
	public void testAdd() {
		//Calculator calc=new Calculator();
		int expected=10;
		int actual=calc.add(1,2,3,4);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		//Calculator calc=new Calculator();
		int expected=2;
		int actual=calc.divide(10, 5);
		assertEquals(expected,actual);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideExp() {
		calc.divide(20,0);
	}
	
	@Test()
	public void testDivideExp1() {
		ArithmeticException myexp=assertThrows(ArithmeticException.class,()->calc.divide(10, 0));
		assertTrue(myexp.getMessage().equals("/ by zero"));
		
		
	}

}
