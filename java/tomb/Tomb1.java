import java.util.Scanner;

/**
 * Tomb1
 */
public class Tomb1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mennyi szám lesz? ");
        int count = scan.nextInt();
        int[] szamok = new int[count];
        for (int i = 0; i < szamok.length; i++) {
            System.out.print((i+1) + ". szám: ");
            szamok[i] = scan.nextInt();
            System.out.println();
        }
        scan.close();
        System.out.println("A tömb elemei:");
        for (int i : szamok) {
            System.out.println(i);
        }
    }
}