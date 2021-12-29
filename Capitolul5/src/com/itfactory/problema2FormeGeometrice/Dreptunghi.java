package com.itfactory.problema2FormeGeometrice;

public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
    public double perimetru(){
        return 2*(lungime+latime);
    }
    public double arie(){
        return (lungime*latime);
    }
}
