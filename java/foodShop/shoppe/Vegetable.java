package shoppe;

public class Vegetable extends ShopItem {

    
    public Vegetable(String name, int price) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = 0;
        this.daysInTheShop = 0;
    }
    public Vegetable(String name, int price, int daysInTheShop) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = 0;
        this.daysInTheShop = daysInTheShop;
    }

    @Override
    public int calculateFreshness() {
        if(daysInTheShop == 0) return 2;
        if(daysInTheShop <= 3) return 1;
        return 0;
    }

    @Override
    public int reducePrice() {
        if(calculateFreshness() == 0) return (int)(price * 0.6); 
        if(calculateFreshness() == 1) return (int)(price * 0.8); 
        return price;
    }
}
