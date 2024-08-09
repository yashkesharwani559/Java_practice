import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("om");

        String s = "om is my bestfriend and om is very sincere towards his career";

        Matcher m = pattern.matcher(s);

        System.out.println(m.find());

        System.out.println(m.start());

        System.out.println(m.end());

        System.out.println(m.group());
        
    }
}
// true
// 0
// 2
// om

// public int start() -> returns the starting index of the previous found pattern. means its returns the starting index of the match found. 

// public int end() -> returns the offset index of the previous found pattern. means its returns the offset index of the match found. and offset index = last index + 1

// public String group() -> returns the match that is found. It is useful when we find the regex in the target String 

// These all three will give the IllegalStateException (which is an unchecked exception) in the two cases:
// 1. if we had called one or all of these three methods also when we don't called the find() method earlier
// 2. if we had called the find() method but it returned false and then also we are calling one or all of  these three methods.

// so we should always remember that we should call the start(), end(), group() method only when the find() method is already called and it returns true