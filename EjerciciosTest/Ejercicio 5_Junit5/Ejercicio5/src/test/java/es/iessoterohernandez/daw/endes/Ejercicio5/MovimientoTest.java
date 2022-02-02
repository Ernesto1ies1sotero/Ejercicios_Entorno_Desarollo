package es.iessoterohernandez.daw.endes.Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		m=new Movimiento();
	}

	@AfterEach
	void tearDown() throws Exception {
		m=null;
	}

	@Test
	void testGetImporte() {
		m.setImporte(65);
		assertEquals(65,m.getImporte());
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Ingreso");
		assertEquals("Ingreso",m.getConcepto());
	}

	

	//@Test
	//void testGetFecha() {
		//m.setFecha(2019, Month.FEBRUARY, 29);
		//assertEquals(2019, Month.FEBRUARY, 29,m.getFecha());
	//}

	
}
