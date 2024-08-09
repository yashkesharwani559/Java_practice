import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U1 {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("\\d*");//eighteen matches found but only these 3 are there 3465, 4356, 5345
        // and otherwise an empty String

        Matcher m = p.matcher("3465#%@#@4356fter5345$%#@$");

        boolean find;

        System.out.println("\\d* -> 0 or more digits");
        System.out.println("3465#%@#@4356fter5345$%#@$");
        System.out.println("~~~~~~~~~~~~~");

        int i = 0;

        while (find = m.find()) {
            System.out.println(find);
            System.out.println(m.start() + " - " + m.group());
            i++;
        }
        System.out.println(i);

    }
}
