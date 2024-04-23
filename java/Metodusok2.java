public class Metodusok2 {
    public static double negyzetTerulet(double x, double y){
        if(x < 0 ||y < 0)return -1;
        return x*y;
    }
    public static double harmadikSzog(double x, double y){
        if(x <= 0 ||y <= 0)return -1;
        if (x+y >= 180) return -1;
        return 180 - (x+y);
    }
    public static boolean vanNagybetu(String text){
        return(!(text == text.toLowerCase()));
    }
    public static String fejVagyIras(int flip){
        if (flip > 0) return "fej";
        if (flip < 0) return "iras";
        return "elere esett";
    }
    public static void main(String[] args) {
        System.out.println(vanNagybetu("123"));
    }
}
