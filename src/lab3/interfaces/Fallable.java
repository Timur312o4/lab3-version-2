package lab3.interfaces;

public interface Fallable {
    default String fall(int income){
        if (income<10000){
            return "упали";
        }else {
            return "возрасли";
        }
    }
}
