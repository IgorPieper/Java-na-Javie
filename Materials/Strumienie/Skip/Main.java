import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> n1 = Stream.of(1, 6, 7, 8, 0, 10, 18, 62, 2, 4, 0);
        n1.skip(2).forEach(System.out::println);

        //Pomiń pierwsze 2 elementy

    }
}
