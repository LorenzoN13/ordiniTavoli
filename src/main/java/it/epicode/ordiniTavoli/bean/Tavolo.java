package it.epicode.ordiniTavoli.bean;

import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int numeroMaxCoperti;
    private double costoCoperto;
    private StatoTavolo statoTavolo;
}
