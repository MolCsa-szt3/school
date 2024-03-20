public class ArraysMerging {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int[] arr2 = { 10, 324, 45, 90, 9808 };
        int[] arrCombined = new int[arr.length + arr2.length];
        System.out.println("elso");
        for (int i = 0; i < arr.length; i++) {
            arrCombined[i] = arr[i];
        }
        System.out.println("masodik");
        for (int i = 0; i < arr2.length; i++) {
            arrCombined[i + arr.length] = arr2[i];
        }
        for (int i : arrCombined) {
            System.out.println(i);
        }
    }
}
