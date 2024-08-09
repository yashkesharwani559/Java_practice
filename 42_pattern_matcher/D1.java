import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class D1 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("hello");

        // Matcher m = p.matcher("hello");//true
        // java.util.regex.Matcher[pattern=hello region=0,5 lastmatch=]
        // true

        Matcher m = p.matcher("Hello");// false
        // java.util.regex.Matcher[pattern=hello region=0,5 lastmatch=]
        // false

        System.out.println(m);

        System.out.println(m.find());

    }
}
