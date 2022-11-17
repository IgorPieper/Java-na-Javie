import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> n1 = Stream.of(1, 6, 7, 8, 0);
        System.out.println(n1.anyMatch(n -> n % 2 == 0));
        Stream<Integer> n2 = Stream.of(1, 6, 7, 8, 0);
        System.out.println(n2.allMatch(n -> n % 2 == 0));

    }
}
