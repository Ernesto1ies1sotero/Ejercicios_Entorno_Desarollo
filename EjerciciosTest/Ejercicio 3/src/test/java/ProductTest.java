import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductTest {

	
	Product p1;
	Product p2;
	   
	   
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p1 = new Product("Televisor oled",1000);
        p2 = new Product("Patatas fritas",2.5);
	}

	@After
	public void tearDown() throws Exception {
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
		 System.out.println("equals");
	        Object o = null;
	        Product instance = null;
	        boolean expResult = false;
	        boolean result = instance.equals(o);
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	//assertEquals(true,p2.equals(p1));
	}

}
