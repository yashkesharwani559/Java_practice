import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F1 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("om");

        String s = "om is my bestfriend and om is very sincere towards his career. om is the boss.";

        Matcher m = pattern.matcher(s);

        boolean str;

        while (str = m.find()) {
            System.out.println(str);
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }
}

// true
// 0
// 2
// om
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// true
// 24
// 26
// om
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// true
// 63
// 65
// om
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~