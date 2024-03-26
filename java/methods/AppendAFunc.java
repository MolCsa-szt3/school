public class AppendAFunc {
    public static String[] addAnA(String[] without){
        String[] ret = new String[without.length];
        for(int i = 0; i < without.length; i++) ret[i] = without[i] + "a"; 
        return ret;
    }
    public static void main(String[] args) {
        String[] aMentes = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};
        aMentes = addAnA(aMentes);
        for (String string : aMentes) {
            System.out.println(string);
        }
    }
}
