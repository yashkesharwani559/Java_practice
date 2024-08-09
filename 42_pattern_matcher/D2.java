import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class D2 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);//this second parameter helps to check the pattern case-insensitively.

        // Matcher m = p.matcher("hello");//true
        // java.util.regex.Matcher[pattern=hello region=0,5 lastmatch=]
        // true

        Matcher m = p.matcher("Hello");//true
        // java.util.regex.Matcher[pattern=Hello region=0,5 lastmatch=]
        // true

        System.out.println(m);

        System.out.println(m.find());

    }
}
