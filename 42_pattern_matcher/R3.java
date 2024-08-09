import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{2}");//two match 97, 34

        Matcher m = p.matcher("_#9734@#~^");

        System.out.println("_#9734@#~^");
        System.out.println("\\d{2}");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
