package it.epicode.ordiniTavoli.bean;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ItemOrdine {

    private Item menuItem;
    private int quantità;

    public ItemOrdine (Item menuItem, int quantità){
        this.menuItem = menuItem;
        this.quantità = quantità;
    }

    public double getTotale() {
        return menuItem.getPrezzo() * quantità;
    }

}
