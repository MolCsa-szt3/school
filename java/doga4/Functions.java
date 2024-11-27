public class Functions {

    public static int dividersNumber(int num){
        num = Math.abs(num);
        if (num <= 1) return num;
        int counter = 2; //becasue all numbers are divisible by 1 and themselves
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) counter++;
        }
        return counter;
    }
    public static int maxOfThree(int uno, int dos, int tres){
        if(uno > dos) return uno > tres ? uno : tres;
        return dos > tres ? dos : tres;
    }
    public static Object fizzBuzz(int num){
        String fizzBuzzTracker = "";
        if(num % 3 == 0) fizzBuzzTracker += "Fizz";
        if(num % 5 == 0) fizzBuzzTracker += "Buzz";
        return fizzBuzzTracker.isEmpty() ? num : fizzBuzzTracker;
        //returning Object feels extremely silly tbh, but hey, it works
    }
    public static boolean isVowel(char betu){
        char[] vowels = "aeiou".toCharArray();
        for (char c : vowels) {
            if (c == Character.toLowerCase(betu)) return true;
        }
        return false;
    }
    //szorgalmi later

    public static boolean queens(String queen1, String queen2){
        if (queen1.equals(queen2)) throw new IllegalArgumentException();
        //check is same row/column
        for (int i = 0; i < 2; i++) {
            if(queen1.charAt(i) == queen2.charAt(i)) return true;
        }
        //time for jank
        int[] queen1Pos = {Character.getNumericValue(queen1.charAt(1)),0};
        int[] queen2Pos = {Character.getNumericValue(queen2.charAt(1)),0};
        char[] rows = "ABCDEFGH".toCharArray();
        for (int i = 0; i < rows.length; i++) {
            if(queen1.charAt(0) == rows[i]) queen1Pos[1] = i;
            if(queen2.charAt(0) == rows[i]) queen2Pos[1] = i;
        }
        //so now we have a rough estimate where on the board they are with only 1 number
        int[] diff = {Math.abs(queen1Pos[0] - queen2Pos[0]),Math.abs(queen1Pos[1] - queen2Pos[1])};
        //System.out.println(diff[0]);
        //System.out.println(diff[1]);
        if(diff[0] == diff[1]) return true;
        return false;
    }
    public static void main(String[] args) {
        queens("A1", "B3");
    }

}