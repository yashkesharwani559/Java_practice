import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("[g-n]");

        String s = "aman kumar is my best friend# (*)";

        Matcher m = p.matcher(s);

        boolean find;

        while(find = m.find()){
            System.out.println(find);
            System.out.println(m.start() + " - " + m.group());
            System.out.println("+++++++++++++++++++++++");
        }
    }
}
// [g-n] -> means one character between g to n where g and n are also inclusive.