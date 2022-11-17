package klasy.OgraniczoneGeneryki;

//Działa tylko dla Integerów i int'ów
public class OgraniczonaKlasa<T extends Integer>{  
  
    private T liczba;

    public void setLiczba(T liczba) {
        this.liczba = liczba;
    }

    public T getLiczba() {
        return liczba;
    }
}
