import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Dablu //allowed
public class S4 {

    @Dablu //not allowed
    int x = 45;

    @Dablu //allowed
    void pro() {

    }

    @Dablu //not allowed
    S4() {
    }

}

@Target({ElementType.TYPE, ElementType.METHOD})
@interface Dablu{

}

// S4.java:7: error: annotation type not applicable to this kind of declaration
//     @Dablu //not allowed
//     ^
// S4.java:15: error: annotation type not applicable to this kind of declaration
//     @Dablu //not allowed
//     ^
// 2 errors
// error: compilation failed
