/**
 * MetodusokDolgozat2
 */
public class MetodusokDolgozat2 {

    public static int masodfokuMegoldasSzam(int a, int b, int c){
        if (a == 0) return -1;
        if (((b*b) - (4*a*c)) < 0 )return 0;
        if ((b*b) - (4*a) == 0 )return 1;
        return 2;
    }
    public static boolean vanKisbetu(String text){
        return (text != text.toUpperCase());
    }

    public static String getMeret(double size){
        if(size < 150) return "XS";
        if(size < 160) return "S";
        if(size < 170) return "M";
        if(size < 180) return "L";
        if(size < 190) return "XL";
        return "XXL";
    }
    public static String rubikKockaSzin(int id){
        String[] szinek = "yellow;red;orange;white;blue;green".split(";");
        if(id < 1 || id > 6) return "invalid parameter";
        return szinek[id - 1];
    }
    public static void main(String[] args) {
        System.out.println(masodfokuMegoldasSzam(1,3,4));
        System.out.println(rubikKockaSzin(7));
    }
}