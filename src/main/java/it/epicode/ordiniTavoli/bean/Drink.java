package it.epicode.ordiniTavoli.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Drink extends Item{
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
