import java.text.MessageFormat;

class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String nev, int age, String gender){
        this.name = nev;
        this.age = age;
        this.gender = gender;
    }

    public void setGoal(){
        System.out.println("Céom: Élj a pillanatnak!");
    }

    public void introduce(){
        System.out.println(MessageFormat.format("Szia, {0} vagyok, {1} éves {2}.",name, age, gender)); //idea stolen from StackOverflow
    }
}

public class Persons {
    public static void main(String[] args) {
        Person laci = new Person("László", 24, "férfi");
        Person joe = new Person("Joe Mama", 69, "male");
        Person kati = new Person("Kata", 21, "nő");
        Person jane = new Person("Jane Doe", 30,"female");
        laci.introduce();
        laci.setGoal();
        joe.introduce();
        joe.setGoal();
        kati.introduce();
        kati.setGoal();
    }
    
}
