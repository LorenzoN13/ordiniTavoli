package it.epicode.ordiniTavoli.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Topping extends Item{

    @ManyToMany(mappedBy = "toppings")//perche il nome toppings si trova nella classe pizza
    private List<Pizza> pizze;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
