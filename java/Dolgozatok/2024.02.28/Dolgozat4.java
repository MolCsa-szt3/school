import java.util.Scanner;

public class Dolgozat4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adj meg egy számot 1 és 10 közt (se nem 10 sem 1): ");
        int num = scan.nextInt();
        scan.close();
        if (num > 1 && num < 10){
            switch (num) {
                case 4:
                    System.out.println("Oszható 1-el, 2-vel és 4-el.");
                    break;
                case 6:
                    System.out.println("Oszható 1-el, 2-vel, 3-al és 6-el.");
                    break;
                case 8:
                    System.out.println("Oszható 1-el, 2-vel, 4-el és 8-al.");
                    break;
                case 9:
                    System.out.println("Oszható 1-el, 3-al és 9-el.");
                    break;
                default:
                    System.out.println("A szám prímszám.");
                    break;
            }
        }
        else System.out.println("A szám téves!");
    }
}
