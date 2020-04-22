package com.company;

public class Klant {
    String naam;
    double kortingsPercentage;

    public Klant(String nm){
        this.naam = nm;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam +
                " (korting: " + kortingsPercentage +
                "%)";
    }
}
