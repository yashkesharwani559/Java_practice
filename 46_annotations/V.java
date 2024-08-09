import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class V {
    public static void main(String[] args) {
        Class klass = student.class;

        Object obj = klass.getAnnotation(VV.class);

        System.out.println(obj);//@VV(name="yash", age=21)

    }
}

@Retention(RUNTIME)
@interface VV {
    String name();

    int age();
}

@VV(name = "yash", age = 21)
class student {
}
