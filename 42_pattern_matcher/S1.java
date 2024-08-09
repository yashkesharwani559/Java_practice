import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{3,}");//three match 9734, 8932447, 765

        Matcher m = p.matcher("_#9734@#~^8932447$!*72_-_3+-_765");

        System.out.println("_#9734@#~^8932447$!*72_-_3+-_765");
        System.out.println("\\d{3}");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
// \d{3,} -> means atleast three digits should be there and more than three digits are allowed but not less than three. No of digits allowed >= 3