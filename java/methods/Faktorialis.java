import java.util.Scanner;

public class Faktorialis {
    public static int faktorial(int nums){
        int sum = 1;
        for (int i = 0; i < nums; i++) {
            sum *= i+1;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Adjon megy egy számot: ");
        Scanner scan = new Scanner(System.in);
        int where = scan.nextInt();
        scan.close();
        System.out.println(faktorial(where));
        
    }
}
