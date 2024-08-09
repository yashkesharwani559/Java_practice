import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G1 {
    public static void main(String[] args){
        // Pattern p = Pattern.compile("\\d");
        Pattern p = Pattern.compile("[0-9]");//same as above

        String s = "1256sdf54 _67_8_8";

        Matcher m = p.matcher(s);

        boolean find;

        while (find = m.find()) {
            System.out.println(find);
            System.out.println(m.group());
        }
    }
}

// \d -> regex used for exactly one digit (0 to 9)