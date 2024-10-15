package shoppe;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<ShopItem> stock;
    
    public Shop(){
        stock = new ArrayList<>();
    }

    public Shop(List<ShopItem> stock){
        this.stock = stock;
    }

    public void fillStock(ShopItem toAddItem){
        stock.add(toAddItem);
    }
    public void showStock(){
        for (int i = 0; i < stock.size(); i++) {
            System.out.println(MessageFormat.format("{0}. item: {1}, {2}Ft, {3} freshness",i,stock.get(i).name,stock.get(i).reducePrice(), stock.get(i).convertFreshnessToString() ));

        }    
    }
    public int getStockValue(){
        int sum = 0;
        for (ShopItem shopItem : stock) {
            sum += shopItem.reducePrice();
        }
        return sum;
    }
    private boolean isSuperHealthy(ShopItem toTest){
        return toTest.preservativePercentage < 2 && toTest.calculateFreshness() == 2;
    }
    public void sellItems(int maxSpend, boolean superHealthy){
        int currentSpend = 0;
        List<Integer> soldItems = new ArrayList<>();

        for (int i = 0; i < stock.size(); i++) {
            if(stock.get(i).price < (maxSpend - currentSpend) && (!superHealthy || isSuperHealthy(stock.get(i)))){
                currentSpend += stock.get(i).price;
                soldItems.add(i);
            }
        }
        for (int i = soldItems.size() - 1; i >= 0; i--) {
            stock.remove(soldItems.get(i));
        }

    }
    public void closeShop(){
        for (ShopItem shopItem : stock) {
            int oldPrice = shopItem.reducePrice();
            shopItem.daysInTheShop += 1;
            int newPrice = shopItem.reducePrice();
            System.out.printf("--- %s ---",shopItem.name);
            System.out.printf("Old price: %d", oldPrice);
            if(oldPrice == newPrice) System.out.println("Price isn't reduced yet!");
            else System.out.printf("Price reduced! New price: %d",newPrice);
        }
    }
}
