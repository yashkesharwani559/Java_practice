import java.util.regex.Pattern;
import java.util.regex.Matcher;

class V {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a.b");//four match found a_b, atb, a-b, abb

        Matcher m = p.matcher("a_b#^atb-!~a-b_abb");

        System.out.println("a_b#^atb-!~a-b");
        System.out.println("a.b");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while(m.find()) {
            System.out.println("Match Found: " + m.group());
        }
    }    
}

