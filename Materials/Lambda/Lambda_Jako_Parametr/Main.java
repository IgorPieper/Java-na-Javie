import klasy.FunkcjonalnaFunkcyja;

public class Main {
    public static void main(String[] args) {

        FunkcjonalnaFunkcyja ff = (a, b) -> a+b;
        int result = method(ff);
        System.out.println(result);

    }

    public static int method(FunkcjonalnaFunkcyja ff) {
        return ff.zwroc(5, 6);
    }
}
