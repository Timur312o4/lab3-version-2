package lab3.objects;

public class Money {
    private final String name;
    @Override
    public String toString(){
        return name;
    }
    public Money(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
