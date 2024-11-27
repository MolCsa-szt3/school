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

}