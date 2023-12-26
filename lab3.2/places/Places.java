package lab3.places;
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
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Places places = (Places) obj;
        return name.equals(places.name);
    }

    public abstract void check(Places obj);

    @Override
    public abstract void be(Places place);

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
