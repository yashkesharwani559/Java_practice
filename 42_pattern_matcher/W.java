import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile(".xx");//two match found 4xx, rxx

        Matcher m = p.matcher("_a2r34xx~!@56uyrxxioPt78");

        System.out.println("_a2r34xx~!@56uyrxxioPt78");
        System.out.println(".xx");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while(m.find()) {
            System.out.println("Match Found: " + m.group());
        }
    }    
}

