import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingCartTest {

	
	Product p2;
    Product p1;
    ShoppingCart s1;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		Product p1 = new Product("Televisor oled",1000);
        Product p2 = new Product("Patatas fritas", 2.5);
        ShoppingCart s1 = new ShoppingCart();
        s1.addItem(p2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBalance() {
		assertEquals(2.5, s1.getBalance(),0.01);
	}

	@Test
	public void testAddItem() {
		s1.addItem(p1);
        double Total=p1.getPrice()+p2.getPrice();
        assertEquals(Total,s1.getBalance(),0.001);
        assertEquals(2,s1.getItemCount());
	}

	@Test
	public void testRemoveItem() throws ProductNotFoundException {
		s1.removeItem(p2);
        assertEquals(1,s1.getItemCount());
	}

	@Test
	public void testGetItemCount() {
		s1.addItem(p1);
        assertEquals(2,s1.getItemCount());
	}

	@Test
	public void testEmpty() {
		s1.empty();
        assertEquals(0,s1.getItemCount());
	}

}
