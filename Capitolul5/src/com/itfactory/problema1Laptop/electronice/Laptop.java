package com.itfactory.problema1Laptop.electronice;

import com.itfactory.problema1Laptop.componente.MemorieSSD;
import com.itfactory.problema1Laptop.componente.Ram;

public class Laptop
{
    private String marca;
    private String culoare;
    private double dimensiuneEcran;
    private Ram memorieRam;
    private MemorieSSD memorieSSD;

    public Laptop(String marca, String culoare, double dimensiuneEcran) {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }

    public Ram getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(Ram memorieRam) {
        this.memorieRam = memorieRam;
    }

    public MemorieSSD getMemorieSSD() {
        return memorieSSD;
    }

    public void setMemorieSSD(MemorieSSD memorieSSD) {
        this.memorieSSD = memorieSSD;
    }

}
