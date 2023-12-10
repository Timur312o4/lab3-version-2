package lab3.places;


import lab3.interfaces.Tradable;
import lab3.Products.Products;

public class StockMarket extends Market implements Tradable {
    public StockMarket(String name){
        super(name,PlacesType.STOCKMARKET);
    }
    @Override
    public void trade(Products products){
        System.out.println(name +" продавать "+products);
    }
}
