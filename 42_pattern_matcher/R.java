import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("\\d");//four matches 9, 7, 3, 4

        Matcher m = p.matcher("_#9734@#~^");

        System.out.println("_#9734@#~^");
        System.out.println("\\d");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
