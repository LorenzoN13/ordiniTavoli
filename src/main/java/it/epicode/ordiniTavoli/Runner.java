package it.epicode.ordiniTavoli;

import it.epicode.ordiniTavoli.bean.*;
import it.epicode.ordiniTavoli.service.ItemService;
import it.epicode.ordiniTavoli.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@Component
public class Runner  implements CommandLineRunner {
    @Autowired
    private MenuService menuService;

    @Autowired
    private ItemService itemService;

    private Logger logger = LoggerFactory.getLogger("ordiniTavoli");
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //Tavolo t1 = ctx.getBean("tavolo1", Tavolo.class);

        //logger.info("Il tavolo 1 è: " + t1);

        //Ordine order = new Ordine(t1, 2);

        //List<Pizza> pizze = menu.getPizze();

        //List<Drink> drinks = menu.getDrinks();

        //order.setPizze(pizze);
        //order.setDrinks(drinks);

        //logger.info("L'ordine è: " + order);

        //logger.info("Il totale dell'ordine è: " +order.totaleOrdine());

        Menu menu = ctx.getBean("menu", Menu.class);

        menu.stampaMenu();

        menuService.salvaMenu(menu);

        Drink water = ctx.getBean("water", Drink.class);
        water.setMenu(menu);
        itemService.salvaItem(water);

        Drink cocaCola= ctx.getBean("cocaCola", Drink.class);
        cocaCola.setMenu(menu);
        itemService.salvaItem(cocaCola);

        Topping mozzarella = ctx.getBean("mozzarella", Topping.class);
        mozzarella.setMenu(menu);
        itemService.salvaItem(mozzarella);

        Topping pomodoro = ctx.getBean("pomodoro", Topping.class);
        pomodoro.setMenu(menu);
        itemService.salvaItem(pomodoro);

        Topping salame = ctx.getBean("salame", Topping.class);
        salame.setMenu(menu);
        itemService.salvaItem(salame);

        Topping prosciutto = ctx.getBean("prosciutto", Topping.class);
        prosciutto.setMenu(menu);
        itemService.salvaItem(prosciutto);

        Pizza margherita = ctx.getBean("margherita", Pizza.class);
        margherita.setMenu(menu);
        itemService.salvaItem(margherita);


        Pizza margheritaSalame = ctx.getBean("margheritaSalame", Pizza.class);
        margheritaSalame.setMenu(menu);
        itemService.salvaItem(margheritaSalame);









    }
}
