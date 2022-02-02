package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BadMoneyTest {
	
	static Account c1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		c1= new Account("Javier",00000000001,47.5f);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		c1=null;
	}

	

	@Test
	void testDeposit() {
		assertEquals(true,c1.deposit(565.85f));
		assertEquals(false,c1.deposit(-7f));
	}

	@Test
	void testWithdraw() {
		assertEquals(false, c1.withdraw(-5f, -4f));
		assertEquals(true, c1.withdraw(7.5f, 1.5f));
	}

	@Test
	void testAddInterest() {
		c1.addInterest();
		assertEquals(47.5f + (47.5f * 0.045f), c1.getBalance());
	}

	@Test
	void testGetBalance() {
		assertEquals(47.5f, c1.getBalance());
	}

	@Test
	void testGetAccountNumber() {
		assertEquals(00000000001, c1.getAccountNumber());
	}

	//@Test
	//void testToString() {
		//assertEqulas(00000000001+ "\t" +"Javier"+ "\t" + fmt.format(47f),c1.toString());
	//}

}
