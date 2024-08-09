import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J {
    public static void main(String[] args) {
        
        // Pattern p = Pattern.compile("[^bytr]");
        Pattern p = Pattern.compile("[^xhj]");

        String s = "aman kumar is my best friend# (*)";

        Matcher m = p.matcher(s);

        boolean find;

        while(find = m.find()){
            System.out.println(find);
            System.out.println(m.group());
        }
    }
}
// [^btyr] -> means only one character but any character except b or t or y or r . Special characters and digit and whitespaces are also allowed.