public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int max = 0;
        int notmax = 0;
        for (int num : arr) {
            if (num > max){
                notmax = max;
                max = num;
            }
            else if(num > notmax) notmax = num;
        }
        System.out.println(notmax);
    }
}
