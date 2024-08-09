import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{2,4}");//five match 9734, 8932, 447, 72, 765

        Matcher m = p.matcher("_#9734@#~^8932447$!*72_-_3+-_765");

        System.out.println("_#9734@#~^8932447$!*72_-_3+-_765");
        System.out.println("\\d{3}");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (m.find()) {
            System.out.println("Match Found: " + m.group());
        }

    }
}
// \d{2, 4} -> means minimum 2 and maximum 4 digits allowed
// 2 <= no. of digits allowed <= 4