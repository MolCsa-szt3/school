public class Underwear extends Cloth {
    public Underwear(String type, String color, int baseCondition){
        this.type = type;
        this.color = color;
        this.condition = baseCondition;
        this.maxCondition = baseCondition;
        this.maxDaysWorn = 1;
    }
    public Underwear(String type, String color){
        this.type = type;
        this.color = color;
        this.condition = 100;
        this.maxCondition = 100;
        this.maxDaysWorn = 1;
    }
    public Underwear(){
        this.type = "Clear-painted";
        this.color = "Underwear";
        this.condition = 100;
        this.maxCondition = 100;
        this.maxDaysWorn = 1;
    }
    @Override
    void repair() {
        //ya can't
    }
}
