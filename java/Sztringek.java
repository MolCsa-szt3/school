
import java.util.Scanner;

public class Sztringek{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add meg a vezetékneved: ");
        String vezetek = scan.nextLine();
        System.out.println("Add meg a keresztneved: ");
        String kereszt = scan.nextLine();
        System.out.println("Add meg a születési helyed: ");
        String szulhely = scan.nextLine();
        System.out.println("Add meg a keresztneved: ");
        int eletkor = scan.nextInt();
        scan.close();
        String fullName = vezetek + " " + kereszt;
        System.out.println(fullName.indexOf(kereszt));;
        System.out.println(fullName.toLowerCase() + " " + szulhely.toLowerCase());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println("A felhasználó " + eletkor + " éves, neve " + fullName + "és születési helye " + szulhely + ".");
        System.out.println("A keresztnév " + (kereszt.startsWith("A")?"nem kezdődik A-val, ":"A-val kezdődik, ") + "és a vezetéknév " + (vezetek.endsWith("t")?"":"nem ") + "t-re végződik.");
        System.out.println("A teljes név hossza: " + fullName.length() + ".");
        System.out.println(fullName.replace('i', 'y'));



        
    }
}