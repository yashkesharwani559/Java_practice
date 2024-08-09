import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R1 {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("\\d\\d");//two matches 97, 34

        Matcher m = p.matcher("_#9734@#~^");

        System.out.println("_#9734@#~^");
        System.out.println("\\d\\d");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
