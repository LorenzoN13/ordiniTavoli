package it.epicode.ordiniTavoli;


import it.epicode.ordiniTavoli.bean.StatoOrdini;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class OrdiniTavoliApplicationTests {
	static AnnotationConfigApplicationContext ctx;

	static void accediAlContesto(){
		ctx = new AnnotationConfigApplicationContext(OrdiniTavoliApplication.class);
	}

	@Test
	void verificaStatoOrdini(){
		ServizioOrdine servizioOrdine = ctx.getBean(ServizioOrdine.class);
		Assertions.assertAll(
				() -> Assertions.assertTrue("IN_CORSO".equals(StatoOrdini.IN_CORSO))
		);
	}


	static void chiudiContesto(){
		ctx.close();
	}

}
