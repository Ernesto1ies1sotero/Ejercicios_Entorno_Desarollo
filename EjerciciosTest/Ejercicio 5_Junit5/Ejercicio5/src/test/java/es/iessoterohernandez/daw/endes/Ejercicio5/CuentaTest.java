package es.iessoterohernandez.daw.endes.Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	Cuenta c1;

	



	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cuenta("154575","Carlos");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		c1=null;
	}

	@Test
	void testIngresarDouble() {
		try {
			c1.ingresar(500.0);
			assertEquals(500.0,c1.getSaldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testRetirarDouble() {
		try {
		c1.retirar(500.0);
		assertEquals(0.0,c1.getSaldo());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	@Test
	void testIngresarStringDouble() {
		try {
			c1.ingresar("Ingreso", 650);
			assertEquals(650,c1.getSaldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testRetirarStringDouble() {
		try {
			c1.retirar("Retirada", 650);
			assertEquals(0,c1.getSaldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testGetSaldo() throws Exception {
		c1.ingresar(25);
		assertNotEquals(650,c1.getSaldo());
	}

	

}
