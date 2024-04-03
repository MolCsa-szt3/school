public class UserData {

    public static String user(String first, String last, int age) {
        return String.format("%s %s %d",first, last, age);
    }
    public static String user(String first, int age, String last) {
        return String.format("%s %s %d",first, last, age);
    }
    public static String user(int age, String first, String last) {
        return String.format("%s %s %d",first, last, age);
    }

    public static void main(String[] args) {
        System.out.println(user(12,"Deez", "Nuts"));
    }
}
