public class Overwear extends Cloth {
    public Overwear(String type, String color, int baseCondition){
        this.type = type;
        this.color = color;
        this.condition = baseCondition;
        this.maxCondition = baseCondition;
        this.maxDaysWorn = 5;
    }
    public Overwear(String type, String color){
        this.type = type;
        this.color = color;
        this.condition = 50;
        this.maxCondition = 50;
        this.maxDaysWorn = 5;
    }
    public Overwear(){
        this.type = "Clear-painted";
        this.color = "Overwear";
        this.condition = 50;
        this.maxCondition = 50;
        this.maxDaysWorn = 5;
    }

    @Override
    Boolean needsToBeRepaired() {
        return condition >= 1 && condition <= 5;
    }

}
