import java.util.ArrayList;
import java.util.List;
public class FibonacciList {

    // The fibonacci sequence is a famous bit of mathematics,
    // and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    // Each subsequent value is the sum of the previous two values,
    // so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a fibonacci(n) method that
    // returns a list of the nth fibonacci numbers,
    // with n=0 representing the start of the sequence.
    // The method should be able to handle invalid input (e.g. negative numbers)
    // Example:
    // fibonacci(4) - > [0, 1, 1, 2]
    // fibonacci(10) - > [0, 1, 1, 2, 3, 5, 8, 13, 21, 33]

    public static void main(String[] args) {

        System.out.println(fib(10));
        System.out.println(fib(0));
        System.out.println(fib(-1));

    }
    public static List<Integer> fib(int count){
        if(count < 0) throw new ArithmeticException("Nemnegatív számot adjon meg!");
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < count;i++){
            if (i < 2) nums.add(i);
            else nums.add(nums.get(i-1) + nums.get(i-2));
        }
        return nums;
    }
}