import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    
    public static void main(String[] args) {
        //Create a map where the keys are strings and the values are strings
        // with the following initial values
        //978-1-60309-452-8 : A Letter to Jo, 978-1-60309-459-7 : Lupus
        //978-1-60309-444-3 : Red Panda and Moon Bear, 978-1-60309-461-0 : The Lab
        HashMap<String, String> letters = new HashMap<>();
        letters.put("978-1-60309-452-8", "A Letter to Jo");
        letters.put("978-1-60309-459-7", "Lupus");
        letters.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        letters.put("978-1-60309-461-0", "The Lab");
        

        //Print all the key-value pairs in the following format
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)
        
        letters.forEach((key,value)->{
            System.out.println(value + " (ISBN: " + key + ")");
        });

        //Remove the key-value pair with key 978-1-60309-444-3
        letters.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        String removal = "";
        /*letters.forEach((key,value)->{
            if(value == "The Lab") removal = key;
        });*/

        for(Map.Entry m : letters.entrySet()){
            if(m.getValue() == "The Lab") removal = m.getKey().toString();
        }
        letters.remove(removal);
        //Add the following key-value pairs to the map
        //978-1-60309-450-4 : They Called Us Enemy, 978-1-60309-453-5 : Why Did We Trust Him?
        letters.put("978-1-60309-450-4","They Called Us Enemy");
        letters.put("978-1-60309-453-5","Why Did We Trust Him?");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(letters.containsKey("478-0-61159-424-8"));;

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(letters.get("978-1-60309-453-5"));

        
    }

    // Output:
    //    A Letter to Jo (ISBN: 978-1-60309-452-8)
    //    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    //    Lupus (ISBN: 978-1-60309-459-7)
    //    The Lab (ISBN: 978-1-60309-461-0)
    //    false
    //    Why Did We Trust Him?
}