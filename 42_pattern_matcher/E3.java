import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E3 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("om");

        String s = "om is my bestfriend and om is very sincere towards his career";

        Matcher m = pattern.matcher(s);


        System.out.println(m.start());

        System.out.println(m.end());

        System.out.println(m.group());
        
    }
}
// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:451)
//         at E3.main(E3.java:14)