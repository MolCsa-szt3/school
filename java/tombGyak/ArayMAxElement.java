/**
 * ArayMAxElement
 */
public class ArayMAxElement {

    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int max = 0;
        for (int i : arr) {
            if (i > max) max = i;
        }
        System.out.println(max);
    }
}