package es.iessoterohernandez.daw.endes.Ejercicio2_junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.Ejercicio2_junit5.Serie;

class SerieTest extends CoreMatchers{
	
	static Serie s1;
    static Serie s2;
    static Serie s3;
    static Serie s4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1 = new Serie("Arcane", 1, "Animacion", "Netflix");
        s2 = new Serie("The Simpsons", 15487, "Comedia", "Fox");
        s3 = new Serie("House", 8, "Drama", "Fox");
        s4 = new Serie("Arcane", 1, "Animacion", "Netflix");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		s1=null;
		s2=null;
		s3=null;
		s4=null;
	}

	

	@Test
	public void testSetTitulo() {
		s1.setTitulo("Arcane");
        assertEquals("Arcane", s1.getTitulo());
	}

	@Test
	public void testSetnumeroTemporadas() {
		s2.setnumeroTemporadas(15487);
        assertEquals(15487, s2.getnumeroTemporadas());
	}

	@Test
	public void testSetGenero() {
		s1.setGenero("Animación");
        assertEquals("Animación", s1.getGenero());
	}

	@Test
	public void testSetcreador() {
		s2.setcreador("Fox");
        assertEquals("Fox", s2.getGenero());
	}

	@Test
	public void testEntregar() {
		s1.entregar();
        assertEquals(true, s1.isEntregado());
	}

	@Test
	public void testDevolver() {
		s1.devolver();
        assertEquals(false, s1.isEntregado());
	}

	@Test
    public void testIsEntregado() {
        s1.devolver();
        assertEquals(false, s1.isEntregado());
    }
	@Test
	public void testCompareTo() {
		assertEquals(Serie.MENOR, s1.compareTo(s2));
        assertEquals(Serie.MAYOR, s2.compareTo(s1));
        assertEquals(Serie.IGUAL, s1.compareTo(s4));
	}

	@Test
	public void testToString() {
		assertEquals("Informacion del videojuego: \n"
                + "\tTitulo: " + s1.getTitulo() + "\n"
                + "\tNumero de temporadas: " + s1.getnumeroTemporadas() + "\n"
                + "\tGenero: " + s1.getGenero() + "\n"
                + "\tCreador: " + s1.getcreador(), s1.toString());
	}

	@Test
	public void testEqualsSerie() {
		assertEquals(false, s1.equals(s2));
        assertEquals(true, s1.equals(s4));
	}

}
