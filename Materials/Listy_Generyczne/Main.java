import klasy.ObjectOne;
import klasy.ObjectTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            ObjectOne o1 = new ObjectOne("Jan", "Matejko");
            ObjectOne o2 = new ObjectOne("Tom", "Crusaide");
            ObjectTwo t3 = new ObjectTwo(3, 4);

            // Mieszane dla różnych obiektów
      
            List<Object> Lista1 = new ArrayList<>();
            Lista1.add(o1);
            Lista1.add(o2);
            Lista1.add(t3);

            // Dla wybranego typu obiektów
      
            List<ObjectOne> Lista2 = new ArrayList<>();
            Lista2.add(o1);
            Lista2.add(o2);
            
            // Wyświetlanie zawartości
      
            ObjectOne tymcza = Lista2.get(0);
            System.out.println(tymcza.imie);
          }
}
