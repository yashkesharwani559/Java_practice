import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class I {
    public static void main(String[] args) {
        
        // Pattern p = Pattern.compile("[bytr]");
        Pattern p = Pattern.compile("[xhj]");

        String s = "aman kumar is my best friend";

        Matcher m = p.matcher(s);

        boolean find;

        while(find = m.find()){
            System.out.println(find);
            System.out.println(m.group());
        }
    }
}

// [bytras] -> anyone character from b or y or t or r or a or s