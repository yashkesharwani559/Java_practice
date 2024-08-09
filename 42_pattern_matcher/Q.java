import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q {
    public static void main(String[] args){
        
        Pattern p = Pattern.compile("0[Xx][0-9a-fA-F]");//four matches found 0x7, 0X9, 0X3 and 0xA

        Matcher m = p.matcher("mohan0x7a2g3_#70X9abacqw320xy3ws0X3J92_^0xAH5");

        while(m.find()) {
            System.out.println("Match Found: " + m.group());
        }
    }
}