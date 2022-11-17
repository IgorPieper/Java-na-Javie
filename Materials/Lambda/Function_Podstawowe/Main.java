import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // 10/2.0 = 5.0
        
        Function<Integer, Double> test = a -> a/2.0;
        System.out.println(test.apply(10));
    }
}
