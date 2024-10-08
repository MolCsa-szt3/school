package zoo;

public class Bird extends Animal{

    String breed;
    String sound;

    public Bird(String name, String breed, int age, String sound){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.sound = sound;
    }
    

    @Override
    String breed() {
        return this.breed;
    }

    @Override
    void sound() {
        System.out.println(this.sound + " " + this.sound);
    }

    @Override
    boolean isLandAnimal() {
        return false;
    }
    
}
