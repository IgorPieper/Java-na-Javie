import klasy.ObjectOne;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> klasa = Class.forName(ObjectOne.class.getName());
        System.out.println(klasa);
        
    }
}
