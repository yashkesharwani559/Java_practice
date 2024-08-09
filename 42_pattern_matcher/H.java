import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H {
    public static void main(String[] args) {
        
        // Pattern p = Pattern.compile("\\w");
        Pattern p = Pattern.compile("[0-9a-zA-Z]");

        String s = "2g#$%#1#Y%(*) rsd";

        Matcher m = p.matcher(s);

        boolean find;

        while (find = m.find()) {
            System.out.println(find);
            System.out.println(m.group());
        }
    }
}
// \w or ([0-9a-zA-Z]) -> is a regex which means only one character from the range(0-9a-zA-Z)