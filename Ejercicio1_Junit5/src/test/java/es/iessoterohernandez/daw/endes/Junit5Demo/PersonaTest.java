package es.iessoterohernandez.daw.endes.Junit5Demo;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonaTest extends CoreMatchers{
	
	static Persona p1;
	static Persona p2;
	static Persona p3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Antes de ejecutar ningun metodo de la clase");
		p1 = new Persona("Juan", 18, 'H', 70, 1.85);
		p2 = new Persona("Carlos", 20, 'H', 140, 2.00);
		p3 = new Persona("Alberto", 16, 'H', 40, 2.00);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Después de ejecutar los metodos de la clase");
		p1=null;
		p2=null;
		p3=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Antes de ejecutar cada metodo de la clase");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Después de ejecutar cada metodo de la clase");
	}
	
	
	
	@Test
	void testCalcularIMC() {
		assertEquals(Persona.INFRAPESO, p3.calcularIMC());
        assertEquals(Persona.SOBREPESO, p2.calcularIMC());
        assertEquals(Persona.PESO_IDEAL, p1.calcularIMC());
        assertThat(null, null);//hamcrest
	}

	@Test
	void testEsMayorDeEdad() {
		assertEquals(true, p1.esMayorDeEdad());
	    assertEquals(false, p3.esMayorDeEdad());
	}

}
