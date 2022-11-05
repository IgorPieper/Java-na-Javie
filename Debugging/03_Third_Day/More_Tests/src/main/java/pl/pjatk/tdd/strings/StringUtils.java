package pl.pjatk.tdd.strings;

public class StringUtils {
    public static int NumberSum(String number){
        int numberr = Integer.parseInt(number);
        if (numberr > 9 && numberr < 100){
            char first = number.charAt(0);
            char second = number.charAt(1);
            int num_f = Integer.parseInt(String.valueOf(first));
            int num_s = Integer.parseInt(String.valueOf(second));
            return num_f+num_s;
        } else if (numberr <= 9) {
            return numberr;
        } else if (numberr >= 100) {
            return 0;
        } else{
            return 0;
        }
    }
}
