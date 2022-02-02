package es.iessoterohernandez.daw.endes.Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	Cuenta cu;
	Debito tarjetaD;
	Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		cu = new Cuenta("0000.2471.42.1234512345", "Jacinto");
		cu.ingresar(10000.0);

		String caducidad = "03/01/2023";
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date duracion = formato.parse(caducidad);
		Date fechaCaducidad = new Date(duracion.getTime());

		tarjetaD = new Debito("0000000000000000", "Jacinto", fechaCaducidad);
		tarjetaD.setCuenta(cu);
	}

	@Test
	void testRetirar() {
		try {
			tarjetaD.retirar(100);

		} catch (Exception e) {
			fail("No debería fallar");
		}
		assertEquals(9900, tarjetaD.getSaldo());
	}

	@Test
	void testIngresar() {
		try {
			tarjetaD.ingresar(200);
			assertEquals(9800, tarjetaD.getSaldo());
			

		} catch (Exception e) {
			fail("No deberia fallar");
		}
		
	}

	@Test
	void testPagoEnEstablecimiento() {
		try {
			tarjetaD.pagoEnEstablecimiento("Game", 450);

		} catch (Exception e) {
			fail("No deberia fallar");
		}
		assertEquals(9550, tarjetaD.getSaldo());
	}

	@Test
	void testGetSaldo() {
		try {
			Movimiento m = new Movimiento();
			tarjetaD.ingresar(50);
			m.getImporte();
		} catch (Exception e) {
		}
		assertNotEquals(60.0, tarjetaD.getSaldo());
		assertEquals(9950.0,tarjetaD.getSaldo());
	}

	
	
}
