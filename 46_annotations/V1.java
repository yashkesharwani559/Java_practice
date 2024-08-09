import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class V1 {
    public static void main(String[] args) {
        Class klass = student1.class;

        Object obj = klass.getAnnotation(VV1.class);

        System.out.println(obj);//@VV1(name="rahul", age=22)

    }
}

@Retention(RUNTIME)
@interface VV1 {
    String name() default "rahul";

    int age() default 22;

    int sem = 6;//means this property is not included with the annotation object but it can be called separately using <annotation-name>.<member-name> that is defined like this inside in an annotation
    
}

@VV1
class student1 {
}
