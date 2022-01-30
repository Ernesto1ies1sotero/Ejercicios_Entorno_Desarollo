package es.iessoterohernandez.daw.endes.Ejercicio2_junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import es.iessoterohernandez.daw.endes.Ejercicio2_junit5.*;

class VideojuegoTest {
	
	 static Videojuego v1;
	 static Videojuego v2;
	 static Videojuego v3;
	 static Videojuego v4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		v1 = new Videojuego("Returnal", 60, "Acción", "Housemarque");
        v2 = new Videojuego("Total War", 60, "Estrategia", "The Creative Assembly");
        v3 = new Videojuego("League of legends", 1000, "Moba", "Riot");
        v4 = new Videojuego("Total War", 60, "Estrategia", "The Creative Assembly");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		v1=null;
		v2=null;
		v3=null;
		v4=null;
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
        assertEquals("Housemarque", v1.getcompanya());
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
                + "\tcompañia: " + v2.getcompanya(), v2.toString());
	}

	@Test
	public void testEqualsVideojuego() {
		assertEquals(false, v1.equals(v2));
        assertEquals(true, v4.equals(v2));
	}

}
