package lab3.Persons;

import lab3.Products.Vegetables;
import lab3.objects.Stall;
import lab3.places.Places;
import lab3.interfaces.Tradable;
import lab3.Products.Products;

public class TraderFructs extends Person implements Tradable{
    public TraderFructs(String name,String alternative, Places location){
        super(name,alternative,location);
    }
    @Override
    public void trade(Products products){
        System.out.println(" продают " + products);
    }
    public String sell(){
        return " торгует " + this.name;
    }
    public void spreadOut(Vegetables product, Stall place){
        System.out.println("достаточно разложить свои " + product +" на " + place);
    }
}
