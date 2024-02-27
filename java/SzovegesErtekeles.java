import java.util.Scanner;

/**
 * SzovegesErtekeles
 */
public class SzovegesErtekeles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Add meg az érdemjegyet: ");
        int erdemjegy = scan.nextInt();
        scan.close();
        switch (erdemjegy) {
            case 1:
                System.out.println("elégtelen");
                break;
            case 2:
                System.out.println("elégséges");
                break;
            case 3:
                System.out.println("közepes");
                break;
            case 4:
                System.out.println("jó");
                break;
            case 5:
                System.out.println("jeles");
                break;
            default:
            System.out.println("nincs ilyen jegy");
                break;
        }
    }
}