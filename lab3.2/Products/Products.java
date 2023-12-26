package lab3.Products;
public class Products {
    protected String name;
    public Products(){

    }
    public Products(String name){
        this.name=name;
    }
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
        return this.name.equals(product.name);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
