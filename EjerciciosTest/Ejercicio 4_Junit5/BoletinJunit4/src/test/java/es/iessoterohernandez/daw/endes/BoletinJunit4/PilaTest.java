package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	
	static Pila p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p=new Pila();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		p=null;
	}

	
	@Test
	void testPush() {
		p.push(0);
		assertEquals(true,p.isEmpty());
		p.push(16);
		assertNotEquals(true,p.isEmpty());
	}
//No se porque el testPush falla.
	
	@Test
	void testPop() {
		p.push(7);
		assertEquals(7,p.pop());
		
		
	}

	
	@Test
	void testTop() {
		p.push(5);
		p.push(8);
		p.push(15);
		assertEquals(15,p.top());
	}

}
