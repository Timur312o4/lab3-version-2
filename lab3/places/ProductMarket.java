package lab3.places;
import lab3.interfaces.Tradable;
import lab3.Products.Products;

public class ProductMarket extends Market implements Tradable{
    protected Products product;
    public ProductMarket(String name, Products product){
        super(name,PlacesType.MARKET);
        this.name=name;
        this.product = product;
    }
    @Override
    public void trade(Products products){
        System.out.println(name + " продавать "+ products.getName());
    }
    public Products getProducts(){
        return product;
    }
}
