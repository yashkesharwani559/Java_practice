import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O {
    public static void main(String[] args){
        
        Pattern p = Pattern.compile("0x[0-9a-f]");//only one match 0x7

        Matcher m = p.matcher("mohan0x7a2g3_#70X9abacqw320xy3ws0X3J92_^0xAH5");

        while(m.find()) {
            System.out.println("Match Found: " + m.group());
        }
    }
}
//here 0x[0-9a-f] means first two characters must be 0x and after it the third character should be from 0 to 9 or from a to f