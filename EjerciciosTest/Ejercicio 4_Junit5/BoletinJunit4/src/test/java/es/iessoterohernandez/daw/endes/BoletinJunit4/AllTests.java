package es.iessoterohernandez.daw.endes.BoletinJunit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, PilaTest.class, BoaTestParametrizado.class, OperadorAritmetico.class,FridgeTestParametrizado.class })

public class AllTests {

}
