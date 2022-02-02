package es.iessoterohernandez.daw.endes.Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	Cuenta cu;
	Credito tarjeta;
	Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		cu = new Cuenta("0000.2471.42.1234512345", "Jacinto");
		cu.ingresar(1000.0);

		String caducidad = "03/01/2023";
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date duracion = formato.parse(caducidad);
		Date fechaCaducidad = new Date(duracion.getTime());

		tarjeta = new Credito("0000000000000000", "Jacinto", fechaCaducidad, 1000.0);
		tarjeta.setCuenta(cu);
	}

	@Test
	void testRetirar() {
		try {
			tarjeta.retirar(100);

		} catch (Exception e) {
			fail("No debería fallar");
		}
		assertEquals(5, tarjeta.getSaldo());
	}

	@Test
	void testIngresar() {
		try {
			tarjeta.ingresar(200);
			assertEquals(200, tarjeta.getSaldo());
			

		} catch (Exception e) {
			fail("No deberia fallar");
		}
		assertEquals(200, tarjeta.getSaldo());
	}

	@Test
	void testPagoEnEstablecimiento() {
		try {
			tarjeta.pagoEnEstablecimiento("Game", 450);

		} catch (Exception e) {
			fail("No deberia fallar");
		}
		assertEquals(450, tarjeta.getSaldo());
	}

	@Test
	void testGetSaldo() {
		try {
			Movimiento m = new Movimiento();
			tarjeta.ingresar(50);
			m.getImporte();
		} catch (Exception e) {
		}
		assertNotEquals(60.0, tarjeta.getSaldo());
		assertEquals(50.0,tarjeta.getSaldo());
	}

	@Test
	void testGetCreditoDisponible() {
		try {

			tarjeta.retirar(200);

		} catch (Exception e) {
		}
		assertEquals(990.0, tarjeta.getCreditoDisponible());
		assertNotEquals(995.0, tarjeta.getCreditoDisponible());
	}
	
	
}
