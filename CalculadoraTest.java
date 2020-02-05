import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();
	
	@Test
	public void testSumar() {
		int val1 = calc.sumar(7,3);
		int val2 = 10;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testRestar() {
		int val1 = calc.restar(10, 4);
		int val2 = 6;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testMultiplicar() {
		int val1 = calc.multiplicar(4, 5);
		int val2 = 20;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testDividir() {
		int val1 = calc.dividir(45, 5);
		int val2 = 9;
		assertEquals(val1, val2);
	}

}
