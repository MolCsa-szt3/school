/**
 * MetodusokDolgozat
 */
public class MetodusokDolgozat {
    
    public static int signOfTheNumber(int num){
        if (num == 0) return 0;
        return num / Math.abs(num);
    }

    public static String twoParameters(int uno, int dos){
        return "first parameter: " + uno +", second parameter: " + dos;
    }
    public static String twoParameters(String uno, int dos){
        return "first parameter: " + uno +", second parameter: " + dos;
    }
    public static String twoParameters(String uno, String dos){
        return "first parameter: " + uno +", second parameter: " + dos;
    }
    public static String twoParameters(int uno, String dos){
        return "first parameter: " + uno +", second parameter: " + dos;
    }

    public static double triangleArea (int a, int b,int c){
        double[] tester = new double[] {a,b,c,a,b};
        for (int i = 0; i < 3; i++) {
            if ((tester[i] + tester[i+1]) <=tester[i+2]) return -1;
        }
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    public static String secondDegreeFunction (double a, double b, double c){
        if (a == 0) return "nem masodfoku a fuggveny";
        if (((b*b) - (4*a*c)) < 0) return "nincs valos megoldas";
        
        double x1 = (-b + secDeg(a, b, c))/(2*a);
        double x2 = (-b - secDeg(a, b, c))/(2*a);
        return "x1 = " + x1 +", x2 = " + x2;
    }
    public static double secDeg (double a, double b, double c){
        return Math.sqrt((b*b) - (4*a*c));
    }


    public static void main(String[] args) {
        
System.out.println(signOfTheNumber(10));
System.out.println(signOfTheNumber(1));
System.out.println(signOfTheNumber(0));
System.out.println(signOfTheNumber(-10));
System.out.println(signOfTheNumber(-1));
System.out.println(twoParameters(2, 3));
System.out.println(twoParameters("2", 3));
System.out.println(twoParameters(2, "3"));
System.out.println(twoParameters("2", "3"));
System.out.println(twoParameters(4, 5));
System.out.println(twoParameters("4", 5));
System.out.println(twoParameters(4, "5"));
System.out.println(twoParameters("4", "5"));
System.out.println(triangleArea(3, 4, 0));
System.out.println(triangleArea(0, 1, 0));
System.out.println(triangleArea(3, 4, 5));
System.out.println(triangleArea(4, 6, 8));
System.out.println(triangleArea(3, 4, 7));
System.out.println(triangleArea(1, 2, 4));
System.out.println(secondDegreeFunction(0, 6, 5));
System.out.println(secondDegreeFunction(0, 1, 1));
System.out.println(secondDegreeFunction(1, 3, 4));
System.out.println(secondDegreeFunction(2, 4, 3));
System.out.println(secondDegreeFunction(2, -4, 2));
System.out.println(secondDegreeFunction(1, 0, -4));
    }
}