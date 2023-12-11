package lab3;

public enum Town {
    DAVILON("Давилон"),BREKHENVIL("Брекхенвиль"), GRABENBERG("Грабенберг"),SAN_KOMARIK("Сан-Комарик");
    private final String name;
    Town(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
