import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;//using static import

@Dablu //allowed
public class S6 {

    @Dablu //allowed
    int x = 45;

    @Dablu //allowed
    void pro() {

    }

    @Dablu //allowed
    S6() {
    }

}

@Target({TYPE, METHOD, FIELD, CONSTRUCTOR})
@interface Dablu{

}
//correct