import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> n1 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        n1.collect(Collectors.toList()).forEach(System.out::println);
    }
}
