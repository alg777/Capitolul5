package com.itfactory.problema2FormeGeometrice;

public class Triunghi {
    private double side1;
    private double side2;
    private double side3;

    public Triunghi(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double perimetru(){
        return side1+side2+side3;
    }

}
