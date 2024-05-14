import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {

        //We are going to play with maps. Feel free to use the built-in methods where possible.
        //
        //Create an empty map where the keys are integers and the values are characters

        HashMap<String, String> aeiou = new HashMap<>();

        //Print out whether the map is empty or not

        System.out.println(aeiou.isEmpty());

        //Add the following key-value pairs to the map
        //97 : a, 98 : b, 99 : c, 65 : A, 66 : B, 67 : C
        aeiou.put("97", "a");
        aeiou.put("98", "b");
        aeiou.put("99", "c");
        aeiou.put("65", "A");
        aeiou.put("66", "B");
        aeiou.put("67", "C");

        //Print all the keys
        System.out.println(aeiou.keySet());

        //Print all the values
        System.out.println(aeiou.values());

        //Add value D with the key 68
        aeiou.put("68", "D");


        //Print how many key-value pairs are in the map
        System.out.println(aeiou.size());


        //Print the value that is associated with key 99
        System.out.println(aeiou.get("99"));

        //Remove the key-value pair with key 97 and print the associated value
        System.out.println(aeiou.remove("97"));

        //Print whether there is an associated value with key 100 or not
        System.out.println(aeiou.containsKey("100"));

        //Remove all the key-value pairs
        aeiou.clear();

        //Print how many key-value pairs are in the map
        System.out.println(aeiou.size());

    }

    // Output:
    // true
    // [97, 65, 98, 66, 99, 67]
    // [a, A, b, B, c, C]
    // 7
    // c
    // a
    // false
    // 0

}