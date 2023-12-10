package lab3.Persons;
import lab3.interfaces.Earnable;
import lab3.interfaces.*;
import lab3.objects.Money;
import lab3.places.Places;
import lab3.Products.Shares;

public class MainHero extends Person implements Locateable, Earnable {
    private int counter = 0;

    public MainHero(String name, String alternativeName, Places places) {
        super(name, alternativeName, places);
    }

    @Override
    public void earn(int count, Money obj) {
        if (count<10000){
            System.out.println("как много" + " мог бы заработать " + obj);
        } else{
            System.out.println("почему " + "не смог бы заработать " + obj);
        }
    }

    public String wasGoingTo(Shares obj,int income) {
        counter++;
        if (income >= 10000) {
            return getNameOrPronoun() + "не собирался " + "покупать, так как" + obj.fall(income);
        }else {
            return getNameOrPronoun() + " собирался скупить "+obj+" " + obj.fall(income);
        }
    }
    public String getNameOrPronoun() {
        if (counter % 2 == 0) {
            counter++;
            return name;
        } else {
            counter++;
            return alternativeName;
        }
    }
    public void estimate() {
        System.out.println(this.name + " " + "начал прикидывать в уме ");
    }
    public void underst(String obj) {
        if (!obj.substring(0, 2).equals("не")) {
            System.out.println(name + " понял, что" + obj);
        } else {
            System.out.println("осознал " + obj);
        }
    }

}
