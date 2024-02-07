package it.epicode.ordiniTavoli;


import it.epicode.ordiniTavoli.bean.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
class OrdiniTavoliApplicationTests {
	static AnnotationConfigApplicationContext ctx;
	static int contatore=0;
	@BeforeAll
	static void accediAlContesto(){
		ctx = new AnnotationConfigApplicationContext(OrdiniTavoliApplication.class);
	}

	@Test
	void verificaTotaleOrdini(){
		Menu menu = ctx.getBean("menu", Menu.class);
		Assertions.assertAll(()-> Assertions.assertNotNull(menu));
	}

	@Test
	void verificaTavalo(){
		Tavolo tavolo = ctx.getBean("tavolo1",Tavolo.class);
		System.out.println(tavolo);
	}






	static void chiudiContesto(){
		ctx.close();
	}

}
