package com.itfactory.problema1Laptop.componente;

public class Ram
{
    private String tipMemorie;
    private String unitateMasura;
    private int capacitateMemorie;

    //CONSTRUCTOR CU PARAMETRI
    public Ram(String tipMemorie, String unitateMasura, int capacitateMemorie) {
        this.tipMemorie = tipMemorie;
        this.unitateMasura = unitateMasura;
        this.capacitateMemorie = capacitateMemorie;
    }
// Doar pentru exercitiu, generez constructor cu 1 parametru. In consola se afiseaza tip de memorie, iar restul null
// in cazul in care construiesc un obiect cu acest constructor.
//    public Ram(String tipMemorie) {
//        this.tipMemorie= tipMemorie;
//    }

    //GETTERS AND... SETTERS pentru ram nu am nevoie
    // pentru ca am  setez cele 3 variabile in LaptopMain
    public String getTipMemorie()
    {
        return tipMemorie;
    }
    public void setTipMemorie(String tipMemorie)
    {
        this.tipMemorie = tipMemorie;
    }

    public String getUnitateMasura()
    {
        return unitateMasura;
    }
    public void setUnitateMasura(String unitateMasura)
    {
        this.unitateMasura = unitateMasura;
    }

    public int getCapacitateMemorie()
    {
        return capacitateMemorie;
    }
    public void setCapacitateMemorie(int capacitateMemorie)
    {
        this.capacitateMemorie = capacitateMemorie;
    }

}
