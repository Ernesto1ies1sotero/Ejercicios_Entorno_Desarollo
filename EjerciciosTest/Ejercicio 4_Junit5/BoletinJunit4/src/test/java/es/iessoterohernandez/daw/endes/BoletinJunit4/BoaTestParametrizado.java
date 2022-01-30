package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BoaTestParametrizado {
	static Boa boa1;
	static Boa boa2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		boa1=new Boa("Bill",2,"granola bars");
		
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		boa1=null;
		
	}

	
	

	@ParameterizedTest(name ="test isHealthy")
	@CsvSource({
		"Bill1,		7,		raton,	false",
		
		"Bill2,		2,		granola bars,	true",
		
		"Bill3,		6,		fish,	false",
		
		"Bill4,		5,		granola bars,	true",
		
	})

	void testIsHealthy(String name,int length,String favoriteFood, boolean expectedResult) {
		boa1= new Boa(name,length,favoriteFood);
		
		
		assertEquals(expectedResult,boa1.isHealthy());
		
	}
	
	
	//
	@ParameterizedTest(name ="test FitsInCage")
	@CsvSource({
		"Bill1,		7,	10,		mouse,	true",
		
		"Bill2,		2,	3,	fish,	false",
		
		"Bill3,		6,	5,	fish,	false",
		
		"Bill4,		5,	6,	granola bars,	true",
		
	})
	void testFitsInCage(String name,int length,int cageLenght,String favoriteFood, boolean expectedResult) {
		boa1= new Boa(name,length,favoriteFood);
		
		assertEquals(expectedResult,boa1.fitsInCage(cageLenght));
	}
	
}
