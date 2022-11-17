package klasy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE})
public @interface Adnotacja {
    int minimalna() default 0;
    int maksymalna() default 100;
}
