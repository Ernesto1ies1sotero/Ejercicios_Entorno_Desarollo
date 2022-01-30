package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {
	
	static int a;
	static int b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		a=6;
		b=3;
	}

	

	@Test
	void testSuma() {
		assertEquals(9,OperadorAritmetico.suma(6, 3));
	}

	@Test
	void testDivision() throws Exception {
		assertEquals(2,OperadorAritmetico.division(6, 3));
	}

}
