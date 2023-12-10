package lab3.objects;

public class Stall {
    private final String name;
    public Stall(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }
}
