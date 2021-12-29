package com.itfactory.problema1Laptop.componente;

public class MemorieSSD
{
    private int capacitateStocare;
    private String unitateMasura;

    //CONSTRUCTOR
    public MemorieSSD(int capacitateStocare, String unitateMasura)
    {
        this.capacitateStocare = capacitateStocare;
        this.unitateMasura = unitateMasura;
    }

    //GETTERS and SETTERS
    public int getCapacitateStocare() {
        return capacitateStocare;
    }

    public String getUnitateMasura() {
        return unitateMasura;
    }

}
