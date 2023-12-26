package lab3.Products;
import lab3.interfaces.*;
public class Shares extends Products implements Fallable {
    public  Shares(){
        super("акции");
    }
    public Shares(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return (this.name + " ");
    }

    @Override
    public String fall(int income) {
        if (income < 10000) {
            return "как только они упадут в цене";
        } else {
            return name +" возрасли ";
        }
    }
    public String nameCost() {
        return "название и цену " + name;

    }
}
