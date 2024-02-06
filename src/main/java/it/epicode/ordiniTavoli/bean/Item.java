package it.epicode.ordiniTavoli.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
public class Item {

    private String nome;
    private int calorie;
    private double prezzo;

    public Item(String name, int calorie, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }
}
