package com.itfactory.problema2FormeGeometrice;

public class FormeGeomMain {
    public static void main(String[] args) {

        Triunghi myTriunghi = new Triunghi(3.0,4.0,5.0);
        Patrat myPatrat =new Patrat(23.0);
        Dreptunghi myDreptunghi = new Dreptunghi(5.0, 12.0);


        System.out.println("\nPerimetrul triunghiului este: " + myTriunghi.perimetru()+ " cm."+"\n______________");

        System.out.println("Perimetrul patratului este: " + myPatrat.perimetru()+ " cm.");
        System.out.println("Aria patratului este: " + myDreptunghi.arie()+ " cm."+ "\n______________");

        System.out.println("Perimetrul dreptunghiului este: " + myDreptunghi.perimetru()+ " cm.");
        System.out.println("Aria dreptunghiului este: " + myDreptunghi.arie()+ " cm.");

    }
}
