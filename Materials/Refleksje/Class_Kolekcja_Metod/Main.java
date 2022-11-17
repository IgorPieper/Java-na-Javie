import klasy.ObjectOne;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        ObjectOne one = new ObjectOne("a");
        Class<?> klasa = one.getClass();

        //System.out.println(klasa.getDeclaredMethods()[0]);

        for (var n: klasa.getDeclaredMethods()) {
            System.out.println(n);
        }

    }
}
