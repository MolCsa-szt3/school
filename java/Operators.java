import java.util.Scanner;
/*
1. Hozd létre a Operators.java fájlt.
2. Kérj be a felhasználótól egy sztring, két karakter, két integer, és két double értéket. A bekért értékeket táeold el egy változóban.
3. Végezd el a műveletet és írasd ki:

    a sztringet add hozzá a két karaktert.
    oszd el a két integert
    add össze a két tizedes számot
    vont ki az egyik integerből a doube számot.
    szorozd össze a másik integer és double számot.
 */
public class Operators{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kérek egy string-et");
        String szoveg = scan.next();
        System.out.println("kérek egy karaktert");
        char karakter = scan.next().charAt(0);
        System.out.println("kérek egy másik karaktert");
        char karakter2 = scan.next().charAt(0);
        System.out.println("kérek egy egész számot");
        int szam = scan.nextInt();
        System.out.println("kérek egy másik egész számot");
        int szam2 = scan.nextInt();
        System.out.println("kérek egy valós számot");
        double lebeg = scan.nextDouble();
        System.out.println("kérek egy másik valós számot");
        double lebeg2 = scan.nextDouble();
        scan.close();
        System.out.println("string + char1+ char2: " + szoveg + karakter + karakter2);
        System.out.println("integer1 + integer2: " + (szam + szam2));
        System.out.println("double1 + double2: " + (lebeg + lebeg2));
        System.out.println("integer1 / integer2: " + (szam / szam2));
        System.out.println("integer1 - double2: " + (szam - lebeg2));
        System.out.println("double1 * integer2: " + (lebeg * szam2));
    }
}