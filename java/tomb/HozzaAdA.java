public class HozzaAdA {
    public static void main(String[] args) {
        String[] tomb = new String[] {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] += "a";
        }
        for (String string : tomb) {
            System.out.println(string);
        }
    }
}
