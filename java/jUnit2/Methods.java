import java.util.HashMap;
import java.util.List;

public class Methods {

    
    public boolean isAnagram(String word1, String word2){
        HashMap<Character,Integer> uno = wordIntoLetters(word1);
        HashMap<Character,Integer> dos = wordIntoLetters(word2);

        return uno.equals(dos);
    }

    public int fibonacci(int n){
        if(n < 0) return -1;
        if(n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int countLetters(String word){
        return wordIntoLetters(word).size();
    }
    
    private HashMap<Character,Integer> wordIntoLetters(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character betu : word.toLowerCase().toCharArray()) {
            if (map.containsKey(betu)) map.put(betu, map.get(betu) + 1);
            else map.put(betu, 1);
        }
        return map;
    }
    
}
