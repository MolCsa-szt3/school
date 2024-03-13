import java.util.Scanner;

public class Szamol3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Add meg a Fizz-t: ");
        int fizz = scan.nextInt();
        System.out.print("Add meg a Buzz-t: ");
        int buzz = scan.nextInt();
        scan.close();
        String fizzbuzz = "";
        for (int i = 1; i < 101; i++) {
            if (i % fizz == 0) fizzbuzz += "Fizz";
            if (i % buzz == 0) fizzbuzz += "Buzz";
            System.out.println(fizzbuzz == ""? i : fizzbuzz);
            if (i % (fizz * buzz) == 0) break;
            fizzbuzz = "";
        }
        
    }
}
