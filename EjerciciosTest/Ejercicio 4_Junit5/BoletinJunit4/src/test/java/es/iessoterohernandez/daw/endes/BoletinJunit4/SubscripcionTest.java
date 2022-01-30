package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {
	
	static Subscripcion s1;
	static Subscripcion s2;
	static Subscripcion s3;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1=new Subscripcion(100,0);
		s2= new Subscripcion(0,6);
		s3= new Subscripcion(60,6);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		s1=null;
		s2=null;
		s3=null;
	}

	
	

	@Test
	void testPrecioPorMes() {
		assertEquals(0.0,s1.precioPorMes());
		assertEquals(0.0,s2.precioPorMes());
		assertEquals(10.0,s3.precioPorMes());
	}

	

}
