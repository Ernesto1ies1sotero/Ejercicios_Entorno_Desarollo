package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	
	static Account c1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c1= new Account("Javier",00000000001,47f);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		c1=null;
	}

	
	@Test
	void testDeposit() {
		assertEquals(true,c1.deposit(565f));
		assertEquals(false,c1.deposit(-7f));
	}

	@Test
	void testWithdraw() {
		assertEquals(false, c1.withdraw(-5f, -4f));
		assertEquals(true, c1.withdraw(7f, 1f));
	}

	@Test
	void testAddInterest() {
		c1.addInterest();
		assertEquals(47f + (47f * 0.045f), c1.getBalance());
	}

	@Test
	void testGetBalance() {
		assertEquals(47f, c1.getBalance());
	}

	@Test
	void testGetAccountNumber() {
		assertEquals(00000000001, c1.getAccountNumber());
	}
	
	@Test
	void testToString() {
		assertEqulas(00000000001+ "\t" +"Javier"+ "\t" + fmt.format(47f),c1.toString());
		
		//He cambiado fmt a public para realizar el test de toString pero no me lo coge.
		
	}
}
