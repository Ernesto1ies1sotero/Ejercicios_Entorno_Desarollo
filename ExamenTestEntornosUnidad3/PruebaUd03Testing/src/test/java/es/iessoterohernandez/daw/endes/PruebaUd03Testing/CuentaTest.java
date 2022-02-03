package es.iessoterohernandez.daw.endes.PruebaUd03Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CuentaTest {
	
	Cuenta c1;



	

	@BeforeEach
	void setUp() throws Exception {
		c1= new Cuenta("00000001","Alfonso");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		c1=null;
		
	}

	@Test
	void testIngresar() {
		try {
			c1.ingresar("Sueldo", 1000);
		} catch (IngresoNegativoException e) {
			fail("No debería fallar");
			e.printStackTrace();
		}
		assertEquals(1000,c1.getSaldo());
	}

	@Test
	void testRetirar() {
		try {
			c1.retirar("Recibo", 200);
		} catch (IngresoNegativoException e) {
			fail("No debería fallar");
			e.printStackTrace();
		} catch (SaldoInsuficienteException e) {
			
			e.printStackTrace();
		}
		assertNotEquals(1000,c1.getSaldo());
	}

	@Test
	void testGetSaldo() {
		try {
			c1.ingresar("Sueldo", 1250);
		} catch (Exception e) {
			fail("No debería fallar");
		}

		assertEquals(1250, c1.getSaldo());	
	}
	

}
