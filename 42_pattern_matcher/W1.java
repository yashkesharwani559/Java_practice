import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W1 {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile(".*xx");//one match found _a2r34xx~!@56uyrxx
        //here it skipped the 4xx and takes the last 'xx'
        // this is called greedy quantifiers

        Matcher m = p.matcher("_a2r34xx~!@56uyrxxioPt78");

        System.out.println("_a2r34xx~!@56uyrxxioPt78");
        System.out.println(".xx");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while(m.find()) {
            System.out.println("Match Found: " + m.group());
        }
    }    
}

