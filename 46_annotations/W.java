import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class W {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Object obj = klass.getAnnotation(Check.class);

        System.out.println(obj);//null
        //means annotations of the parent class are not inherited to the child class

    }
}

@Retention(RUNTIME)
@interface Check{
    String name();
}

@Check(name = "checking")
class User{

}

class Employee extends User{

}