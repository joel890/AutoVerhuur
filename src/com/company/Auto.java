package com.company;

public class Auto {
    String type;
    Double prijsPerDag;

    public Auto(String tp, double prPd){
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public Double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(Double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return type +
                " met prijs per dag: " +
                prijsPerDag;
    }
}
