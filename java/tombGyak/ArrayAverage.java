public class ArrayAverage {
    public static void main(String[] args) {
        
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
