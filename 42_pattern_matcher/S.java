import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{3}");//four match 973, 893, 244, 765

        Matcher m = p.matcher("_#9734@#~^8932447$!*72_-_3+-_765");

        System.out.println("_#9734@#~^8932447$!*72_-_3+-_765");
        System.out.println("\\d{3}");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
