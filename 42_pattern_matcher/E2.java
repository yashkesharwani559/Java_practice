import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E2 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("ram");

        String s = "om is my bestfriend and om is very sincere towards his career";

        Matcher m = pattern.matcher(s);

        System.out.println(m.find());

        System.out.println(m.start());

        System.out.println(m.end());

        System.out.println(m.group());
        
    }
}
// false
// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:451)
//         at E2.main(E2.java:15)