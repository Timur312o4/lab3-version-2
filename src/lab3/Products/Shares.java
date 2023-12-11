package lab3.Products;
import lab3.interfaces.*;
public class Shares extends Products implements Fallable {
    protected String name;

    public Shares(String name) {
        this.name = name;
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
