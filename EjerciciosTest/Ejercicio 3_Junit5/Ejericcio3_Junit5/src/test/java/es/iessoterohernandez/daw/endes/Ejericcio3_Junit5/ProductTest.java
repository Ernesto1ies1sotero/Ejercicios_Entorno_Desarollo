package es.iessoterohernandez.daw.endes.Ejericcio3_Junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	
	static Product p1;
	static Product p2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p1 = new Product("Televisor oled",1000);
        p2 = new Product("Patatas fritas",2.5);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		p1=null;
		p2=null;
	}

	@Test
	public void testGetTitle() {
		assertEquals("Patatas fritas",p2.getTitle());
	}

	@Test
	public void testGetPrice() {
		assertEquals(2.5,p2.getPrice(),0.1);
	}

	@Test
	public void testEqualsObject() {
		assertSame(p2, p2);
	}

}