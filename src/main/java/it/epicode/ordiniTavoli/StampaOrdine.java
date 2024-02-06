package it.epicode.ordiniTavoli;


import it.epicode.ordiniTavoli.bean.Menu;
import it.epicode.ordiniTavoli.bean.Ordine;
import it.epicode.ordiniTavoli.bean.ServizioOrdine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StampaOrdine implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Menu menu = (Menu) ctx.getBean("menu");

        menu.stampaMenu();

        Ordine ordine = (Ordine) ctx.getBean("ordine");


        ServizioOrdine servizioOrdine = new ServizioOrdine();
        servizioOrdine.stampaOrdine(ordine);

    }
}
