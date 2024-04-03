import java.util.Arrays;

public class ArrayToString {
    public static String convertToString(int[] array){
        String text = "[";
        for (int thing : array) {
            text += String.valueOf(thing);
            if(thing == array[array.length-1]) text += "]";
            else text += ", ";
        }
        return text;
    }
    public static String convertToString(double[] array){
        String text = "[";
        for (double thing : array) {
            text += String.valueOf(thing);
            if(thing == array[array.length-1]) text += "]";
            else text += ", ";
        }
        return text;
    }
    public static String convertToString(boolean[] array){
        String text = "[";
        for (boolean thing : array) {
            text += String.valueOf(thing);
            if(thing == array[array.length-1]) text += "]";
            else text += ", ";
        }
        return text;
    }
    public static String convertToString(String[] array){
        String text = "[";
        for (String thing : array) {
            text += String.valueOf(thing);
            if(thing == array[array.length-1]) text += "]";
            else text += ", ";
        }
        return text;
    }

    public static void main(String[] args) {
        System.out.println("why, this has no reason to be made, but whatever");
        System.out.println(convertToString(new int[] {1,2,3,4,5}));
        System.out.println(convertToString(new double[] {1.1,2.2,3.3}));
        System.out.println(convertToString(new boolean[] {true,true,false}));
        System.out.println(convertToString(new String[]{"Deez", "Nuts", "lmao"}));
        System.out.println(Arrays.toString(new String[]{"Deez", "Nuts", "lmao"}));
    }
}
