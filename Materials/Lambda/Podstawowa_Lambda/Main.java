import klasy.FunkcjonalnaFunkcyja;

public class Main {
    public static void main(String[] args) {

        /*
        FunkcjonalnaFunkcyja<Integer> bezLambdy = new FunkcjonalnaFunkcyja<>() {
            @Override
            public String zwroc(Integer a, Integer b) {
                return "Pierwsza Liczba: " + a + "\nDruga Liczba: " + b;
            }
        };
        System.out.println(bezLambdy.zwroc(3, 7));
        */

        FunkcjonalnaFunkcyja<Integer> zLambda = (a, b) -> {
            return "Pierwsza Liczba: " + a + "\nDruga Liczba: " + b;
        };
        System.out.println(zLambda.zwroc(3, 7));


    }
}
