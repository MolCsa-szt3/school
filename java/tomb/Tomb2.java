import java.util.Scanner;

/**
 * Tomb1
 */
public class Tomb2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mennyi tizedes szám lesz? ");
        int count = scan.nextInt();
        double[] szamok = new double[count];
        for (int i = 0; i < szamok.length; i++) {
            System.out.print((i+1) + ". szám: ");
            szamok[i] = scan.nextDouble();
            System.out.println();
        }
        scan.close();
        System.out.println("A tömb elemei:");
        for (double i : szamok) {
            System.out.println(i);
        }
    }
}