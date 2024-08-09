import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class S3<@Rohan r> {//now it is correct
    public static void main(String[] args) {
        System.out.println(12);
    }
}

@Target({ ElementType.TYPE_PARAMETER })
@interface Rohan {

}