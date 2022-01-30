package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FridgeTestParametrizado {
	
	 Fridge f1;
	private Collection<String> comida = new HashSet<String>();

	@BeforeAll
	void setUpBeforeClass() throws Exception {
		f1=new Fridge();
		comida.add("Filete");
		comida.add("Tomates");
		
		
	}

	

	@Test
	void testPut() {
		f1.put("Filete");
		assertEquals(true,f1.contains("Filete"));
	}

	@Test
	void testContains() {
		f1.put("Filete");
		assertEquals(true,f1.contains("Filete"));
	}

	@Test
	void testTake()  {
		
		try {
			f1.put("Tomates");
			assertEquals(true,f1.contains("Tomates"));
			f1.take("Tomates");
			assertEquals(false,f1.contains("Tomates"));
		} catch (NoSuchItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
