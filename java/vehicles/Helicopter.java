package vehicles;

public class Helicopter extends Vehicle implements FlyableInterface{

    private boolean isLanded;
    
    public Helicopter(String name, int weightInKg ){
        this.name = name;
        this.type = "air";
        this.weightInKg = weightInKg;
        this.isLanded = true;
    }
    
    @Override
    public boolean land() {
        if(this.isLanded){
            System.out.println("You already landed!");
            return false;
        }
        System.out.println("Landed succesfully!");
        return true;
    }

    @Override
    public String fly() {
        if(isLanded) return "The helicoptes is not in use.";
        return "The helicopter is flying currently";
    }

    @Override
    public void takeOff() {

        if(!isLanded) System.out.println("You must be grounded to Take off!");
        else{
            System.out.println("Took of succesfully!");
            this.isLanded = false;
        }

    }

    @Override
    public String toString() {
        return "Helicopter [name=" + name + ", type=" + type + ", isLanded=" + isLanded + ", weightInKg=" + weightInKg
                + "]";
    }

    
    
    
}
