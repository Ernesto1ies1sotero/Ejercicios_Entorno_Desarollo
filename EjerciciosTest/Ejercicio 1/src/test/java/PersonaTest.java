import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ejerciciosUnitarias.Persona;

public class PersonaTest {
	
	Persona p;
	Persona p2;
	Persona p3;


	@Before
	public void setUp() throws Exception {
		 p = new Persona("Juan", 18, 'H', 70, 1.85);
		 p2 = new Persona("Carlos", 20, 'H', 140, 2.00);
		 p3 = new Persona("Alberto", 16, 'H', 40, 2.00);
	}

	

	@Test
	public void testSetNombre() {
		 p.setNombre("Juan");
	        assertEquals("Juan", p.getNombre());
	        assertNotEquals("Chema",p.getNombre());
	}

	@Test
	public void testSetEdad() {
		 
	        assertEquals(18, p.getEdad());
	        assertNotEquals(17, p.getEdad());
	}

	@Test
	public void testSetSexo() {
		
        assertEquals('H', p.getSexo());
        assertNotEquals('Y',p.getSexo());
	}

	@Test
	public void testSetPeso() {
		
		assertEquals(75,p.getPeso());
	}

	@Test
	public void testSetAltura() {
		
        assertEquals(1.85, p.getAltura());
        assertNotEquals(1.55, p.getAltura());
	}

	@Test
	public void testCalcularIMC() {
		
        assertEquals(Persona.INFRAPESO, p3.calcularIMC());
        assertEquals(Persona.SOBREPESO, p2.calcularIMC());
        assertEquals(0, p.calcularIMC());
	}

	@Test
	public void testEsMayorDeEdad() {
		assertEquals(true, p.esMayorDeEdad());
	    assertEquals(false, p3.esMayorDeEdad());
	}

	@Test
	public void testToString() {
		p = new Persona("Juan", 18, 'H', 70, 1.85);
        assertEquals("Informacion de la persona:\n"
                + "Nombre: " + "Juan" + "\n"
                + "Sexo: " + 'H' + "\n"
                + "Edad: " + 18 + " años\n"
                + "Peso: " + 70.0 + " kg\n"
                + "Altura: " + 1.85 + " metros\n", p.toString());
	}

}
