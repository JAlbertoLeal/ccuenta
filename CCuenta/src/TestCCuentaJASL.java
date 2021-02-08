import static org.junit.Assert.*;

import org.junit.Test;

public class TestCCuentaJASL {
	Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);

	//1. Prueba de nueva cuenta
	@Test
	public void testCCuentaJASL() {
		assertNotNull(miCuenta);
	}
	
	//2. Creación completa. Prueba que tras crear una cuenta es inmediatamente posible obtener el nombre del títular, la identificación de la cuenta y el saldo.
	@Test
	public void testCreacionCompletaJASL() {
		String resultado = miCuenta.getNombre();
		String esperado = "Ana";
		assertEquals(esperado, resultado);
	}
	
	//3. Ingreso
	@Test
	public void testIngreso() {
		double resultado = miCuenta.ingresar(10.0);
		double esperado = 3210.0;
		assertEquals(esperado, resultado, 0);
	}
	
	//4. Ingreso Negativo
	@Test
	public void testIngresoNegativo() {
		double resultado = miCuenta.ingresar(-10.0);
		double esperado = 3190.0;
		assertEquals(esperado, resultado, 0);
	}
	
	//5. Retirada Correcta
	@Test
	public void testRetirada() {
		double resultado = miCuenta.retirar(200.0);
		double esperado = 3000.0;
		assertEquals(esperado, resultado,0);
	}
	
	//6. Gran retirada
	@Test
	public void testGranRetirada() {
		double resultado = miCuenta.retirar(3201.0);
		double esperado = -1.0;
		assertEquals(esperado, resultado, 0);
	}
}
