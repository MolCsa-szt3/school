package shoppe;

/**
 * ShopItem
 */
public abstract class ShopItem {
    public String name;
    public int price;
    public float preservativePercentage;
    public int daysInTheShop;

    public int calculateFreshness(){
        return 2;
    }
    public int reducePrice(){
        return price;
    }
    public String convertFreshnessToString(){
        if(calculateFreshness() == 0) return "bad";
        if(calculateFreshness() == 1) return "ok";
        return "good";
    }
    
}