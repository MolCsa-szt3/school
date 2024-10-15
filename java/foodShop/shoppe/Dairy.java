package shoppe;

public class Dairy extends ShopItem {

    
    public Dairy(String name, int price,float preservativePercentage) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = preservativePercentage;
        this.daysInTheShop = 0;
    }
    public Dairy(String name, int price,float preservativePercentage, int daysInTheShop) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = preservativePercentage;
        this.daysInTheShop = daysInTheShop;
    }

    @Override
    public int calculateFreshness() {
        if(daysInTheShop <= 3) return 2;
        if(daysInTheShop <= 5) return 1;
        return 0;
    }

    @Override
    public int reducePrice() {
        if(calculateFreshness() == 0) return (int)(price * 0.5); 
        if(calculateFreshness() == 1) return (int)(price * 0.7); 
        return price;
    }
}