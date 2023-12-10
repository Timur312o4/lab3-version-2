package lab3.places;

import lab3.Persons.Person;
import lab3.Products.Products;
import lab3.interfaces.Beable;

public abstract class Places implements Beable {
    protected String name;
    protected PlacesType location;

    public Places(String name, PlacesType location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return (this.name + " ");
    }

    @Override
    public int hashCode() {
        return (this.name).length() * (100000 - 7);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Places places = (Places) obj;
        return name.equals(places.name);
    }

    public void check(Places obj, Places obj1) {
        if (!obj.equals(obj1)) {
            System.out.println(obj1 + " Отличается от " + obj + "потому что");
        } else {
            System.out.println(obj1 + " они схожи " + obj + "потому что");
        }
    }

    @Override
    public void be(Places place) {
        System.out.println("там был " + place);
    }

    public String getName() {
        return this.name;
    }

}
