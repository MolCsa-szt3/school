
import java.util.Scanner;

public class Dolgozat2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Add meg a kör sugarát: ");
        int num = scan.nextInt();
        scan.close();
        double surface =  num * num * Math.PI;
        System.out.println("A kör kerülete: " + surface + ", kerekítve: " + (int)(surface));
    }
}
