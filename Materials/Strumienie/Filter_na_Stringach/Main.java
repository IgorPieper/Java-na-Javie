import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> strumien = Stream.of("Kamień", "Stopa", "jo", "koń", "Grzegrzółka");
        //strumien.filter(s -> Character.isUpperCase(s.charAt(0))).forEach(System.out::println);
        strumien.filter(s -> s.endsWith("a")).forEach(System.out::println);

    }
}
