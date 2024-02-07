package it.epicode.ordiniTavoli;

import it.epicode.ordiniTavoli.bean.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@Component
public class Runner  implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger("ordiniTavoli");
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Tavolo t1 = ctx.getBean("tavolo1", Tavolo.class);

        //logger.info("Il tavolo 1 è: " + t1);

        Menu menu = ctx.getBean("menu", Menu.class);

        menu.stampaMenu();

        Ordine order = new Ordine(t1, 2);

        List<Pizza> pizze = menu.getPizze();

        List<Drink> drinks = menu.getDrinks();

        order.setPizze(pizze);
        order.setDrinks(drinks);

        logger.info("L'ordine è: " + order);

        logger.info("Il totale dell'ordine è: " +order.totaleOrdine());
    }
}
