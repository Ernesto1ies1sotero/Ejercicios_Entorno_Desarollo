package es.iessoterohernandez.daw.endes.BoletinJunit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SelectPackages("es.iessoterohernandez.daw.endes.Boletin4")
@SuiteClasses({})
public class AllTests {
	
	//no me permite hacerlo, al crear el suit no me permite seleccionar las clases del paquete que quiero añadir
	/*
	 He añadido esto pom.xml pero sigue sin ir
	 <dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-runner</artifactId>
    <version>${junit.platform.version}</version>
    <scope>test</scope>
</dependency>*/

}
