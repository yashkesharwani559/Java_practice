import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Inherited;

public class W1 {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Object obj = klass.getAnnotation(Info.class);

        Info info = (Info) obj;

        System.out.println(info);//@Info(name="checking")

    }
}

@Inherited
@Retention(RUNTIME)
@interface Info {
    String name();

    int age = 45;
}

@Info(name = "checking")
class User {

}

class Employee extends User {

}

// @Inherited -> is a meta annotation in java.lang.annotation package. If it is applied to the parent class, then the annotation applied on the parent class is also applicable on its child class.