package it.epicode.ordiniTavoli.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
public abstract class Item {

    private String nome;
    private int calorie;
    private double prezzo;

}
