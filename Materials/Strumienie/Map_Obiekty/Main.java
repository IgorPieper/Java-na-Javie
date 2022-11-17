import klasy.ObjectOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<ObjectOne> l1 = Arrays.asList(
            new ObjectOne("Jaś"),
            new ObjectOne("Staś"),
            new ObjectOne("Gustaw"));

        List<String> l2 = l1.stream().map(n -> n.getImie()).collect(Collectors.toList());
        System.out.println(l2);

    }
}
