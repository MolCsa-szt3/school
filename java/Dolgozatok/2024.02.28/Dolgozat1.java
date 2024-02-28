import java.util.Scanner;

/**
 * Dolgozat1
 */
public class Dolgozat1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Add meg a neved: ");
        String nev = scan.nextLine();
        scan.close(); 
        System.out.println("Hello " + nev + "!");
    }
}
