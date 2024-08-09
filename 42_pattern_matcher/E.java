import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("om");

        String s = "om is a good boy, and om is a good programmer. Like he has a portfolio page of om name";

        Matcher match = p.matcher(s);
        
        
        System.out.println(match.find());//true

        System.out.println(match);
        
        System.out.println(match.start());
        System.out.println(match.end());
        System.out.println(match.group());

    }
}
// true
// java.util.regex.Matcher[pattern=om region=0,86 lastmatch=om]
// 0
// 2
// om


// public boolean find() -> returns true if and only if the pattern is found in the target String and otherwise returns false
// here if we repetitively call the find() method then it will check for more pattern leaving that one which is already found
