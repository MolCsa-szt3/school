import java.util.Scanner;

/**
 * Tomb1
 */
public class Tomb3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mennyi szöveg lesz? ");
        int count = scan.nextInt();
        String[] szamok = new String[count];
        for (int i = 0; i < szamok.length; i++) {
            System.out.print((i+1) + ". szám: ");
            szamok[i] = scan.next();
            System.out.println();
        }
        scan.close();
        System.out.println("A tömb elemei:");
        for (String i : szamok) {
            System.out.println(i);
        }
    }
}