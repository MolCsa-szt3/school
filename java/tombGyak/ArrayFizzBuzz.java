public class ArrayFizzBuzz {
    public static void main(String[] args) {
        String[] tomb = new String[100];
        String temp = "";
        for (int i = 1; i <= tomb.length; i++) {
            if (i % 3 == 0) temp += "Fizz";
            if (i % 5 == 0) temp += "Buzz";
            tomb[i-1] = temp == ""? String.valueOf(i): temp;
            temp = "";
        }
        for (String string : tomb) {
            System.out.println(string);
        }
    }
}
