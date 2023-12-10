package lab3;
import lab3.Persons.Buyers;
import lab3.Persons.MainHero;
import lab3.Persons.TraderShares;
import lab3.Persons.TraderFructs;
import lab3.Products.Fruits;
import lab3.Products.Products;
import lab3.Products.Vegetables;
import lab3.objects.*;
import lab3.places.*;
import lab3.Products.NewsPapers;
import lab3.Products.Shares;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Money money = new Money("деньги");
        Scanner n1 = new Scanner(System.in);
        System.out.println("Введите цену акций");
        int income = n1.nextInt();
        Shares shares = new Shares("акции");
        Stall stall = new Stall("прилавок");
        Fruits apples = new Fruits("яблоки");
        Vegetables tomatoes = new Vegetables("помидоры");
        Vegetables vegetables = new Vegetables("овощи");
        Vegetables cabbage = new Vegetables("капуста");
        Vegetables potato = new Vegetables("картофель");
        Products[] vegetablesFruits = {tomatoes,apples, cabbage,potato};
        OnTheStreet street = new OnTheStreet("улица",PlacesType.ONTHESTREET);

        NewsPapers newspaper = new NewsPapers("газета");
        StockMarket sharesMarket = new StockMarket("рынок акций");
        ProductMarket productMarket = new ProductMarket("торговый рынок",vegetables);
        Buyers buyers= new Buyers("покупатели","они",productMarket);
        Buyers buyer = new Buyers("покупатель","он",sharesMarket);
        MainHero mainHero = new MainHero("Главный герой","м", street);
        TraderShares traderShares = new TraderShares("продавец акций","м",sharesMarket);
        TraderFructs traderFructs = new TraderFructs("продавец фруктов или овощей","м",productMarket);

        mainHero.attention(newspaper,"что"," "+mainHero.wasGoingTo(shares,income));
        mainHero.estimate();
        mainHero.earn(income,money);
        mainHero.underst(mainHero.locate(mainHero.need(),income, false, Town.BREKHENVIL.getName(), sharesMarket, shares));
        mainHero.underst(mainHero.locate(mainHero.need(),income, true, Town.DAVILON.getName() + ", " + Town.GRABENBERG.getName() + ", " + Town.SAN_KOMARIK.getName(), sharesMarket, shares));//нужно быть в ...
        sharesMarket.trade(shares);
        sharesMarket.check(productMarket,sharesMarket);
        for (Products item : vegetablesFruits) {
            productMarket.trade(item);
        }
        traderFructs.spreadOut(vegetables,stall);
        buyers.can("видеть чем",true,traderFructs.sell());
        traderShares.carry(shares);
        traderShares.can("единственно", true,traderShares.scream(shares));
        buyers.can("видеть",false,traderShares.sell());
        buyer.remains(buyers,"только",buyer.scream(shares));
        buyer.wantBuy();
    }
}
