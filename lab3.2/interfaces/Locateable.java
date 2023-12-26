package lab3.interfaces;

import lab3.Products.Products;
import lab3.places.Places;

public interface Locateable {
    default String locate(String need,int income, boolean gp, String location, Places places, Products product) {
            return need + " находиться в " + location + ", потому что только там есть " + places + " где продавали " + product + " которые приносят " + income;

    }
}
