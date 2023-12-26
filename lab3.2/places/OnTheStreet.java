package lab3.places;

public class OnTheStreet extends Places {
    public OnTheStreet(String name, PlacesType location) {
        super(name, location);
    }
    @Override
    public void be(Places obj){
        System.out.println("был"+obj + "который ничего не продаёт");
    }
    @Override
    public void check(Places obj) {
        if (!this.equals(obj)) {
            if (obj instanceof ProductMarket) {
                System.out.println(this + " Отличается от " + obj + " потому что у меня улица, а это" + obj.getName() + " который продает фрукты");
            }else if(obj instanceof StockMarket){
                System.out.println(this + " Отличается от " + obj + " потому что это у меня улица,а это" + obj.getName() + " который продает акции ");
            }
        } else {
            System.out.println(this + " они схожи " + obj + " потому что это улица");
        }
    }
}
