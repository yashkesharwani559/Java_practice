import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U {
    public static void main(String[] args){
        Pattern p = Pattern.compile("\\d+");//three matches found 3465, 4356, 5345

        Matcher m = p.matcher("3465#%@#@4356fter5345$%#@$");

        boolean find;

        System.out.println("\\d+ -> 1 or more digits");
        System.out.println("3465#%@#@4356fter5345$%#@$");
        System.out.println("~~~~~~~~~~~~~");

        while(find = m.find()){
            System.out.println(find);
            System.out.println(m.start() + " - " + m.group());
        }

    }
}
