import java.util.Scanner;

public class Fibonacci {
    public static int fib(int which){
        int[] nums = {1,1};
        int temp = 0;
        if(which <= 2) return 1;
        for (int i = 2; i < which; i++) {
            temp = nums[0] + nums[1];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        return nums[1];
    }
    public static int fibRec(int which){
        if (which == 0) return 0;
        if (which < 2)return 1;
        else return fibRec(which - 2) + fibRec(which - 1);
    }
    public static void main(String[] args) {
        System.out.print("Hanyadik elemet szeretné tudni? ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();
        System.out.println(fibRec(count));
    }
}
