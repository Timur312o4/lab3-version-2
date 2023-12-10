package lab3.Persons;

import lab3.Products.Shares;
import lab3.interfaces.Earnable;
import lab3.interfaces.Tradable;
import lab3.places.Places;
import lab3.interfaces.Carryable;
import lab3.objects.*;
import lab3.Products.*;

public class TraderShares extends Person implements Tradable,Carryable{
    public TraderShares(String name,String alternative,Places location) {
        super(name,alternative,location);
    }
    @Override
    public void trade(Products tovars){
        System.out.println(" продают " + tovars);
    }
    @Override
    public void carry(Products obj) {
        if (obj.toString().substring(obj.toString().length() - 3,obj.toString().length()-1).equals("ии")) {
            System.out.println(name + " носит в кармане" + " свои " + obj);
        }else{
            System.out.println(name + " носит в кармане свой " + obj);
        }
    }
    public String scream(Shares shares){
        return "выкрикивать " + shares.nameCost();
    }
    public String sell(){
        return " торгует ";
    }
}
