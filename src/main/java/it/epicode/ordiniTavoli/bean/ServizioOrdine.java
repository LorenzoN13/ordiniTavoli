package it.epicode.ordiniTavoli.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServizioOrdine {

    @Value("${ordineTavoli.coperto_ristorante}")
    private double coperto;

    public String stampaOrdine(Ordine ordine) {
        System.out.println("\nORDINE STAMPATO:");

        for (ItemOrdine item : ordine.getItems()) {
            System.out.println(item.getQuantità() + "x " + item.getMenuItem().getNome() + " - $" + item.getTotale() + "\n");
        }

        System.out.println("Coperto: " + coperto + "$" + "\n");
        System.out.println("TOTALE: " + calcolaTotale(ordine) + "$" + "\n");
        return ordine.toString();
    }

    private double calcolaTotale(Ordine ordine) {
        double totale = 0;
        for (ItemOrdine item : ordine.getItems()) {
            totale += item.getTotale();
        }
        return totale + coperto;
    }
}
