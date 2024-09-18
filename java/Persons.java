import java.text.MessageFormat;

class Person{
    String name;
    int age;
    String gender;

    public Person(String nev, int age, String gender){
        this.name = nev;
        this.age = age;
        this.gender = gender;
    }

    void setGoal(){
        System.out.println("Céom: Élj a pillanatnak!");
    }

    void introduce(){
        System.out.println(MessageFormat.format("Szia, {0} vagyok, {1} éves {2}.",name, age, gender)); //idea stolen from StackOverflow
    }
}

public class Persons {
    public static void main(String[] args) {
        Person laci = new Person("László", 24, "férfi");
        Person joe = new Person("Joe Mama", 69, "férfi");
        Person kati = new Person("Kata", 21, "nő");
        laci.introduce();
        laci.setGoal();
        joe.introduce();
        joe.setGoal();
        kati.introduce();
        kati.setGoal();
    }
    
}