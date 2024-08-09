import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K {
    public static void main(String[] args) {
        
        // Pattern p = Pattern.compile("[m][y]");
        Pattern p = Pattern.compile("my");//same as above

        String s = "aman kumar is my best friend# (*) 8";

        Matcher m = p.matcher(s);

        boolean find;

        while(find = m.find()){
            System.out.println(find);
            System.out.println(m.group());
        }
    }
}