/**
 * SumANumberAndAnArray
 */
public class SumANumberAndAnArray {

    public static int sumNumNArray(int num, int[] array){
        int stack = num;
        for (int arrayNum : array) {
            stack += arrayNum;
        }
        return stack;
    }
    public static double sumNumNArray(double num, int[] array){
        double stack = num;
        for (int arrayNum : array) {
            stack += arrayNum;
        }
        return stack;
    }
    public static double sumNumNArray(int num, double[] array){
        double stack = num;
        for (double arrayNum : array) {
            stack += arrayNum;
        }
        return stack;
    }
    public static double sumNumNArray(double num, double[] array){
        double stack = num;
        for (double arrayNum : array) {
            stack += arrayNum;
        }
        return stack;
    }
    
    
    public static void main(String[] args) {
        System.out.println(sumNumNArray(1, new int[] {1,2,3}));
        System.out.println(sumNumNArray(1.1, new int[] {1,2,3}));
        System.out.println(sumNumNArray(1, new double[] {1.1,2.2,3.3}));
        System.out.println(sumNumNArray(1.1, new double[] {1.1,2.2,3.3}));
    }
}