import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{3}");//one match 973

        Matcher m = p.matcher("_#9734@#~^");

        System.out.println("_#9734@#~^");
        System.out.println("\\d{3}");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
