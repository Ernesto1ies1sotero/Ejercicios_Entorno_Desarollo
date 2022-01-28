import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ejerciciosUnitarias.Videojuego;

public class VideoJuegoTest {
	
	 Videojuego v1;
	 Videojuego v2;
	 Videojuego v3;
	 Videojuego v4;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		v1 = new Videojuego("Returnal", 60, "Acción", "Housemarque");
        v2 = new Videojuego("Total War", 60, "Estrategia", "The Creative Assembly");
        v3 = new Videojuego("League of legends", 1000, "Moba", "Riot");
        v4 = new Videojuego("Total War", 60, "Estrategia", "The Creative Assembly");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetTitulo() {
		v1.setTitulo("Returnal");
        assertEquals("Returnal", v1.getTitulo());
	}

	@Test
	public void testSetHorasEstimadas() {
		v1.setHorasEstimadas(60);
        assertEquals(60, v1.getHorasEstimadas());
	}

	@Test
	public void testSetGenero() {
		v1.setGenero("Acción");
        assertEquals("Acción", v1.getGenero());
	}

	@Test //getcompanya es un método privado
	public void testSetcompanyia() {
		v1.setcompanyia("Housemarque");
        assertEquals("Housemarque", v1.getcompanyia());
	}

	@Test
	public void testEntregar() {
		v1.entregar();
        assertEquals(true, v1.isEntregado());
	}

	@Test
	public void testDevolver() {
		v1.devolver();
        assertEquals(false, v1.isEntregado());
		
	}

	@Test
	public void testIsEntregado() {
		v1.devolver();
        assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testCompareTo() {
		assertEquals(Videojuego.MENOR, v1.compareTo(v3));
        assertEquals(Videojuego.MAYOR, v3.compareTo(v1));
        assertEquals(Videojuego.IGUAL, v1.compareTo(v2));
	}

	@Test
	public void testToString() {
		assertEquals("Informacion del videojuego: \n"
                + "\tTitulo: " + v2.getTitulo() + "\n"
                + "\tHoras estimadas: " + v2.getHorasEstimadas() + "\n"
                + "\tGenero: " + v2.getGenero() + "\n"
                + "\tcompañia: " + v2.getcompanyia(), v2.toString());
	}

	@Test
	public void testEqualsVideojuego() {
		assertEquals(false, v1.equals(v2));
        assertEquals(true, v4.equals(v2));
	}

}
