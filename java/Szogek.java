import java.util.Scanner;

/**
 * Szogek
 */
public class Szogek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adj meg egy szöget: ");
        int szog = scan.nextInt();
        scan.close();
        switch (szog % 360) {
            case 0:
                if (szog != 0) System.out.println("teljes szög");
                else System.out.println("null szög");
                break;
            case 90:
                System.out.println("derékszög");
                break;
            case 180: 
                System.out.println("egyenes szög");
                break;
            default:
                if ((szog % 360)/90.0 < 1) System.out.println("hegyes szög");
                else if ((szog % 360)/90.0 < 2) System.out.println("tompa szög");
                else System.out.println("homorú szög");
                break;
        }
    }
}