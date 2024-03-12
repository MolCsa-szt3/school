/**
 * FizzBuzz
 */
public class FizzBuzz {

    public static void main(String[] args) {
        String szov = "";
        for(int i = 1; i < 50; i++){
            if (i % 3 == 0) szov += "Fizz";
            if (i % 5 == 0) szov += "Buzz";
            System.out.println(szov == "" ? i : szov);
            szov = "";
        }
    }
}