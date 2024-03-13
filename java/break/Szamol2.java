import java.util.Scanner;

public class Szamol2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int szam = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 100; i++) {
            if (i % szam == 0) System.out.println(i);
            if (i / szam == 10) break;
        }
    }
}
