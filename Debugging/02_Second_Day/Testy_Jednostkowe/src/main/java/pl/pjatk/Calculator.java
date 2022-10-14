package pl.pjatk;

public class Calculator {

    public static int power(int a, int b){
        int c = a;
        for (int i = 1; i < b; ++i){
            c *= a;
        }
        return c;
    }

    public static boolean divided(int a, int b){
        if (a%b == 0){
            return true;
        } else {
            return false;
        }
    }
}
