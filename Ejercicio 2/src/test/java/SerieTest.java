import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ejerciciosUnitarias.Serie;

public class SerieTest {
	
	Serie s1;
    Serie s2;
    Serie s3;
    Serie s4;

	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		s1 = new Serie("Arcane", 1, "Animacion", "Netflix");
        s2 = new Serie("The Simpsons", 15487, "Comedia", "Fox");
        s3 = new Serie("House", 8, "Drama", "Fox");
        s4 = new Serie("Arcane", 1, "Animacion", "Netflix");
	}

	@After
	public void tearDown() throws Exception {
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
