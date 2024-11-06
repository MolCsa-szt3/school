public abstract class Cloth {
    String type;
    String color;
    int condition;
    int maxCondition;
    int daysWorn = 0;
    int maxDaysWorn;

    Boolean needsToBeWashed(){
        return this.daysWorn >= this.maxDaysWorn;
    }
    Boolean needsToBeRepaired(){
        return false;
    }
    void wear() throws Exception{
        if (needsToBeWashed()) throw new Exception("This clothing needs to be washed first before wearing it!");
        this.daysWorn += 1;   
    }
    void wash(){
        this.daysWorn = 0;
        if (this.condition > 0) this.condition -= 1;
    }
    void repair(){
        this.condition = this.maxCondition;
    }
    String getInfo(){
        return this.color + " " + this.type + " worn for " + this.daysWorn + " days, has " + condition + " wash cycles left";
    }

}
