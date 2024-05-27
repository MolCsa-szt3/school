import java.util.ArrayList;
import java.util.HashMap;

public class DatastructuresDolgozat {

    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont
        ArrayList<String> fovarosok = new ArrayList<>();

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        String[] capitals = new String[] {"Wien", "Budapest", "Prag", "Bratislava"};
        for (String string : capitals) {
            fovarosok.add(string);
        }

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(ArrayListToRawString(fovarosok));

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        capitals = new String[] {"Ljubljana", "Sarajevo", "Zagreb"};
        for (String string : capitals) {
            ujElemHozzaadasa(fovarosok, string);
        }

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(ArrayListToRawString(fovarosok));

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
        torolElemet(fovarosok, "Sarajevo");

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(ArrayListToRawString(fovarosok));

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont
        HashMap<String, String> orszagFovaros = new HashMap<>();

        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        orszagFovaros.put("Wien", "Österreich");
        orszagFovaros.put("Budapest", "Magyarország");
        orszagFovaros.put("Ljubljana", "Slovenija");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        System.out.println(orszagFovaros.toString());

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
        System.out.println(fovarosOrszaga(orszagFovaros, "Budapest"));

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        System.out.println(fovarosOrszaga(orszagFovaros, "Zagreb"));

        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        ujFovarosOrszagPar(orszagFovaros, "Zagreb", "Hrvatska");

        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont
        torolAdatPart(orszagFovaros, "Ljubljana");

        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
        try {
            torolAdatPart(orszagFovaros, "Prag");
        } catch (IllegalArgumentException hiba) {
            System.out.println(hiba);
        }
        

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        System.out.println(HashMapToString(orszagFovaros));
    }
    public static String ArrayListToRawString(ArrayList<String> list){
        String raw = list.toString();
        raw = raw.substring(1, raw.length()-2);
        return raw ;

    }
    public static String HashMapToString(HashMap<String, String> list){
        String raw = list.toString();
        raw = raw.substring(1, raw.length()-2);
        raw.replaceAll("=", " - ");
        return raw ;

    }



    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont
    public static void ujElemHozzaadasa(ArrayList<String> list, String elem){
        list.add(elem);
    }


    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont
    public static void torolElemet(ArrayList<String> list, String elem){
        list.remove(elem);
    }

    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont
    public static String fovarosOrszaga(HashMap<String, String> countries, String capital){
        if (countries.containsKey(capital)){
           return countries.get(capital) + "fővárosa " + capital; 
        }
        return capital + " nincs az adatok között.";
    }

    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont
    public static void ujFovarosOrszagPar(HashMap<String, String> countries, String capital, String country){
        countries.put(capital, country);
    }


    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont
    public static void torolAdatPart(HashMap<String, String> countries, String capital){
        if (!countries.containsKey(capital)){
            throw new IllegalArgumentException("Nincs " + capital + " főváros az adatok között");
        }
        countries.remove(capital);
    }


}