package klasy;

public class GenericClass<T>{
    private T rzecz;

    public void setRzecz(T rzecz) {
        this.rzecz = rzecz;
    }

    public T getRzecz() {
        return rzecz;
    }
}
