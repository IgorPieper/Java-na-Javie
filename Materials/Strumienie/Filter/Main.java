import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> strumien = Stream.of(14, 4, 16, 63, 2);
        strumien.filter(n -> n % 2 == 0).forEach(System.out::println);

    }
}
