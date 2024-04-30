/**
 * MasodfokuHiba
 */
public class MasodfokuHiba {

    public static int masodfokuMegoldasokSzama(double a, double b, double c){
        if(a == 0) throw new IllegalArgumentException("a nem lehet 0, mert így nem másodfokú a függvény");
        if (((b*b) - (4* a * c)) < 0 )return 0;
        if ((b*b) - (4* a * c) == 0 )return 1;
        return 2;
    }
    public static String masodfokuGyokok(double a, double b, double c){
        int count = masodfokuMegoldasokSzama(a, b, c);
        switch (count) {
            case 0:
                return "nincs megoldás";
            case 1:
                return "x1 = " + (-b / 2*a);
        
            default:
                return "x1 = " + masodfokuGyok(a,b,c,true) + ", x2 = " + masodfokuGyok(a, b, count, false);
        }
    }
    public static String masodfokuGyok(double a, double b, double c, boolean plus){
        return String.valueOf(-b + (Math.sqrt((b*b) - (4* a * c)) * (plus?1:-1)) / (a * a));
    }
    public static void main(String[] args) {
        System.out.println(masodfokuGyokok(0, 6, 5));
    }
}