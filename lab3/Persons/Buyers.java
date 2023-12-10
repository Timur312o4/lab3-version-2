package lab3.Persons;

import lab3.interfaces.Earnable;
import lab3.objects.Money;
import lab3.Products.Products;
import lab3.places.Places;

public class Buyers extends Person {
    public Buyers(String name, String alternative, Places places) {
        super(name, alternative, places);
    }

    public String scream(Products product){
        return "выкрикивать" + " " + product;
    }
    public void wantBuy(){
        System.out.println("купить "+"которые "+name+" хочет ");
    }
    public void remains(Person name,String charact,String k){
        System.out.println(name+"остается "+charact+ " "+k);
    }
}
