package com.itfactory.problema2FormeGeometrice;

public class Patrat {
    private double side;

    public Patrat(double side) {
        this.side = side;
    }
    public double perimetru(){
        double perimetru4 = side*4;
        return perimetru4;
    }
    public double arie4(){
        double arie4 = side*side;
        return arie4;
    }

}
