import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Dablu //allowed
public class S5 {

    @Dablu //allowed
    int x = 45;

    @Dablu //allowed
    void pro() {

    }

    @Dablu //allowed
    S5() {
    }

}

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@interface Dablu{

}
