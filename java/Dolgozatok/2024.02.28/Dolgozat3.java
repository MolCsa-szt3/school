import java.util.Scanner;

public class Dolgozat3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adj meg egy számot 10 és 90 közt: ");
        int num = scan.nextInt();
        scan.close();
        String fizzbuzz = "";
        if(num > 90 || num < 10) System.out.println("A szám nem helyes!");
        else{
            if (num % 3 == 0) fizzbuzz += "Fizz";
            if (num % 5 == 0) fizzbuzz += "Buzz"; 
            System.out.println(fizzbuzz == ""?num:fizzbuzz);
        }

    }
}
