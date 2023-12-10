package lab3.Products;

import lab3.places.Places;

public abstract class Products {
    protected String name;

    @Override
    public String toString() {
        return (name + " ");
    }

    @Override
    public int hashCode() {
        return (this.name).length() * (100 - 7);
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        Products product = (Products) obj;
        return name.equals(product.name);
    }

    public String getName() {
        return name;
    }
}
