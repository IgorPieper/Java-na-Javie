import klasy.OgraniczonaKlasa;

public class Main {
    public static void main(String[] args) {

        OgraniczonaKlasa<Integer> obiekcik = new OgraniczonaKlasa<>();
        obiekcik.setLiczba(5);
        System.out.println(obiekcik.getLiczba());
    }
}
