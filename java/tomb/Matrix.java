import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A mátrix mérete: ");
        int meret = scan.nextInt();
        int[][] matrix = new int[meret][meret];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (i+1) * (j+1);
            }
        }
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
