package com.itfactory.problema1Laptop.electronice;

import com.itfactory.problema1Laptop.componente.MemorieSSD;
import com.itfactory.problema1Laptop.componente.Ram;

public class LaptopMain
{
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "Negru", 15.6);
        Ram ram = new Ram("DDR3", "GB", 16);
            //Ram ram = new Ram("DD3"); exercitiul meu, explicat in Clasa Ram.
        MemorieSSD memorieSSD = new MemorieSSD(256, "GB");

        //Obs.1 Aici setez laptop1 cu proprietatile obiectului ram din Clasa Ram(linia 10).
        laptop1.setMemorieRam(ram);

        //Obs.2 Aici setez laptop1 cu proprietatile obiectului memorieSSD din Clasa MemorieSSD(linia 11).
        laptop1.setMemorieSSD(memorieSSD);

        // Alternativ, daca nu folosesc linia 15 si 18,
        // merg cu: ram.getTipMemorie(), etc.,
        // respectiv: memorieSSD.getCapacitateStocare(),etc.

        System.out.println("Detalii laptop1: " + "\n\tMarca: " + laptop1.getMarca()
                + "\n\tCuloare: " + laptop1.getCuloare()
                + "\n\tDimensiune Ecran: " + laptop1.getDimensiuneEcran() + "\n");


        System.out.println("Memorie RAM:" + "\n\tTip memorie RAM:" + laptop1.getMemorieRam().getTipMemorie()
                + "\n\tUnitate de Masura Memorie RAM: " + laptop1.getMemorieRam().getUnitateMasura()
                + "\n\tCapacitate memorie RAM: " + laptop1.getMemorieRam().getCapacitateMemorie() + "\n");


        System.out.println("Spatiu de stocare SSD:" + "\n\tCapacitate stocare SSD: " + laptop1.getMemorieSSD().getCapacitateStocare()
                + "\n\tUnitate de masura stocare SSD: " + laptop1.getMemorieSSD().getUnitateMasura());
    }

}
