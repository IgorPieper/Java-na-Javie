import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> strumienLiczb = Stream.of(5, 2, 6, 8, 3, 9);
        strumienLiczb.map(n -> n*3).forEach(System.out::println);

    }
}
