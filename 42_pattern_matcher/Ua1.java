import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ua1 {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("aaa");//two match found
        
        Matcher m = p.matcher("aaaaaaa");

        System.out.println("aaa");
        System.out.println("aaaaaaa");

        while(m.find()){
            System.out.println(m.start() + " - " + m.group() + " - " + m.end());
        }
    }
}