package pl.pjatk;

public class StringUtils {
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String multiplyString(String str, int number){
        String result = "";
        for (int i = 0; i < number; ++i){
            result += str + " ";
        }
    return result.trim();
    }

    public static String removeSmallChars(String str){
        String pattern = "[a-z]";
        return str.replaceAll(pattern, "");
    }

    public static String removeBigChars(String str){
        String pattern = "[A-Z]";
        return str.replaceAll(pattern, "");
    }

    public static String removeAllButLetters(String str){
        String pattern = "\\W";
        String pattern2 = "[0-9]";
        return str.replaceAll(pattern, "").replaceAll(pattern2, "");
    }
}
