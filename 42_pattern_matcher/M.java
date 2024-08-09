import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("[a-gs-z]");

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
// [a-gs-z] -> means one character between a to g or from s to z