package com.company;

public class AutoHuur {

    int aantalDagen;
    Klant huurder;
    Auto gehuurdeAuto;

    public AutoHuur(){
    }
    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }
    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }
    public void setHuurder(Klant k){
        this.huurder = k;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public Klant getHuurder(){
        return huurder;
    }
    public double totaalPrijs(){
        return  (aantalDagen * getGehuurdeAuto().prijsPerDag) * ((100 - getHuurder().kortingsPercentage)/100);
    }

    @Override
    public String toString() {
        if(gehuurdeAuto == null){
            System.out.println("    er is geen auto bekend");
        }else {
            System.out.println(String.format("    autotype: %s", getGehuurdeAuto()));
        }
        if(huurder==null){
            System.out.println("    er is geen huurder bekend");
        }else{
            System.out.println(String.format("    op naam van: %s", getHuurder()));
        }
        try {
            return String.format("    aantal dagen: %d en dat kost %.1f\n",aantalDagen, totaalPrijs() );
        }catch (NullPointerException e) {
            return String.format("    aantal dagen: %d en dat kost 0.0\n",aantalDagen );
        }
    }
}
