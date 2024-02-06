package it.epicode.ordiniTavoli.bean;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private final List<ItemOrdine> items = new ArrayList<>();

    public void addItem(Item menuItem, int quantità) {
        items.add(new ItemOrdine(menuItem, quantità));
    }

    public List<ItemOrdine> getItems() {
        return items;
    }
}
