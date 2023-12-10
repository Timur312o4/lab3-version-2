package lab3.Persons;

import lab3.Products.Products;
import lab3.interfaces.Locateable;
import lab3.Products.NewsPapers;
import lab3.places.*;

public abstract class Person implements Locateable {
    protected String name;
    protected String alternativeName;
    protected Places places;

    public Person(String name, String alternativeName, Places places) {
        this.name = name;
        this.places = places;
        if (alternativeName.equals("ж")) {
            this.alternativeName = "она";
        } else {
            if (alternativeName.equals("м")) {
                this.alternativeName = "он";
            } else {
                if (alternativeName.equals("оно")) {
                    this.alternativeName = "оно";
                } else {
                    this.alternativeName = "они";
                }
            }
        }
    }
    public String remember(String word, String what) {
        if (word.equals("что")) {
            return name +" вспомнил, что" + what;
        } else {
            if (word.equals("про")) {
                return name +" вспомнил про" + what;
            } else {
                return name +" вспомнил " + what;
            }
        }
    }
    @Override
    public String locate(String need,int income ,boolean gp, String location, Places places, Products product) {
        if (income < 10000) {
            if (gp) {
                return need + " находиться в " + location + ", потому что только там есть " + places;
            } else {
                return " не" + need + " находиться в " + location + ", потому что здесь нет " + places;
            }
        } else {
            if (gp) {
                return "не " +need + " находиться в " + location + ", потому что только там есть " + places;
            } else {
                return need + " находиться в " + location + ", потому что здесь нет " + places;
            }
        }
    }

    public void attention(NewsPapers obj,String word ,String what) {
        System.out.println("Обратив внимание на " + obj  +" "+ remember(word,what));
    }

    @Override
    public String toString() {
        return this.name + " ";
    }

    @Override
    public int hashCode() {
        return (this.name).length() * 1000;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        Person person = (Person) obj;
        return name.equals(person.name);
    }

    public void can(String move,boolean pb, String charasteristic) {
        if (pb) {
            if (alternativeName.equals("они")) {
                System.out.println(name + " могут " + move + " " + charasteristic);
            } else {
                System.out.println(name + " может " + move + " " + charasteristic);
            }
        } else {
            if (alternativeName.equals("они")) {
                System.out.println(name + " не могут " + move + " как он" + charasteristic);
            } else {
                System.out.println(name + " не может " + move + " " + charasteristic);
            }
        }
    }
    public String need() {
        return " нужно ";
    }
}

