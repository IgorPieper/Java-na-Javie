import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Klaza k1 = new Klaza();
        Class<?> c1 = k1.getClass();
        Method[] m1 = c1.getDeclaredMethods();
        System.out.println(m1[0].getName());
    }
}
