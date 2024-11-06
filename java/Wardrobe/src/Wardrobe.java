import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<Cloth> cabinet;
    
    public Wardrobe(){
        this.cabinet = new ArrayList<>();
    }
    void addCloth(Cloth toAddCloth){
        this.cabinet.add(toAddCloth);
    }
    void printInfo(){
        for (Cloth cloth : cabinet) {
            System.out.println(cloth.getInfo());
        }
    }
    void washAllClothes(){
        for (Cloth cloth : cabinet) {
            if(cloth.needsToBeWashed())cloth.wash();
        }
    }
    void repairAllClothes(){
        for (Cloth cloth : cabinet) {
            if(cloth.needsToBeRepaired())cloth.repair();
        }
    }
    List<Cloth> purge(){
        List<Cloth> purgedClothes = new ArrayList<>();
        for (Cloth cloth : cabinet) {
            if(cloth.condition == 0){
                purgedClothes.add(cloth);
            }
        }
        for (Cloth cloth : purgedClothes) {
            this.cabinet.remove(cloth);
        }
        return purgedClothes;
    }
}
