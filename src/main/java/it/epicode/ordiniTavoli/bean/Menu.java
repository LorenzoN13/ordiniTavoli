package it.epicode.ordiniTavoli.bean;

import jakarta.persistence.*;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "menu")
    private List<Drink> drinks;

    @OneToMany(mappedBy = "menu")
    private List<Topping> toppings;

    @OneToMany(mappedBy = "menu")
    private List<Pizza> pizze;

    @Transient
    private Logger logger = LoggerFactory.getLogger("ordineTavoli");

    public void stampaMenu(){
        logger.info("PIZZE");
        pizze.stream().forEach(pizza -> logger.info(pizza.getNome() +
                ", calorie: " + pizza.getCalorie() + ", prezzo: " +pizza.getPrezzo()));


        logger.info("TOPPINGS");
        toppings.stream().forEach(topping -> logger.info(topping.getNome() +
                ", calorie: " + topping.getCalorie() + ", prezzo: " +topping.getPrezzo()));


        logger.info("DRINKS");
        drinks.stream().forEach(drink -> logger.info(drink.getNome() +
                ", calorie: " + drink.getCalorie() + ", prezzo: " +drink.getPrezzo()));
    }

}
