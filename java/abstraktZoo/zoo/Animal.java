package zoo;

public abstract class Animal {
    String name;
    int age;
    boolean gender; //true: male

    public String Getname(){
        return name;
    }

    abstract String breed();

    abstract void sound();

    abstract boolean isLandAnimal();
}
    
