package es.iessoterohernandez.daw.endes.PruebaUd03Testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	static Movimiento m;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m = new Movimiento();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		m=null;
		
	}

	

	@Test
	void testSetConcepto() {
		m.setConcepto("Recibo");
		assertEquals("Recibo",m.getConcepto());
		assertThat("Recibo",equalTo(m.getConcepto()));

	}

	@Test
	void testSetImporte() {
		m.setImporte(150.0);
		assertEquals(150.0,m.getImporte());
				
		
	}

}
