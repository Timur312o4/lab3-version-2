package lab3.places;


import lab3.interfaces.Tradable;
import lab3.Products.Products;

public class StockMarket extends Market implements Tradable {
    public StockMarket(String name){
        super(name,PlacesType.STOCKMARKET);
    }
    @Override
    public void be(Places obj){
        System.out.println("был "+this+" который" + "продаёт акции");
    }

    public void check(Places obj) {
        if (!this.equals(obj)) {
            if (obj instanceof ProductMarket) {
                System.out.println(this + " Отличается от " + obj + "потому что это " + obj.getName() + " который продает фрукты");
            }else if(obj instanceof OnTheStreet){
                System.out.println(this + " Отличается от " + obj + "потому что это " + obj.getName() + " который ничего не продает ");
            }
            } else {
                System.out.println(this + " они схожи " + obj + "потому что"+ obj.getName()+" тоже продаёт акции");
        }
    }
    @Override
    public void trade(Products products){
        System.out.println(name +" продавать "+products);
    }
}
