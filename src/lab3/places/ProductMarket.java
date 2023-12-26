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
    public void be(Places obj){
        System.out.println("был "+this+" который" + "продаёт овощи и фрукты");
    }
    public void check(Places obj) {
        if (!this.equals(obj)) {
            if (obj instanceof StockMarket) {
                System.out.println(this + " Отличается от " + obj + "потому что это" + obj.getName() + ",который продает акции");
            }else if(obj instanceof OnTheStreet){
                System.out.println(this + " Отличается от " + obj + "потому что это" + obj.getName() + ",который ничего не продает ");
            }
        } else {
            System.out.println(this + " они схожи " + obj + "потому что"+obj+"продавать овощи и фрукты");
        }
    }
    @Override
    public void trade(Products products){
        System.out.println(name + " продавать "+ products.getName());
    }
    public Products getProducts(){
        return product;
    }
}
