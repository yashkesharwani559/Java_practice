import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("");

        Matcher m = new Matcher(p, "");//compilation fail

    }
}

// public final class Matcher extends Object implements MatchResult -> is a class in the java.util.regex package that is used to match the pattern with the target.
// Matcher(Pattern pattern, CharSequence text) -> here in the Matcher class the constructor is not private but it is default. That's why we can't access and we can't use it to create object of the Matcher class
// but we can use matcher() method of the pattern class to create the object of the Matcher class
// 
// public Matcher matcher(CharSequence c) -> here this is an instance method of the Pattern class that takes the CharSequence object as argment and returns the Matcher object.
// here we know that CharSequence is an interface so we can pass object of its subclass into it. the normally used subclass of the CharSequence interface are String, StringBuffer, StringBuilder


// D.java:9: error: Matcher(Pattern,CharSequence) is not public in Matcher; cannot be accessed from outside package
//         Matcher m = new Matcher(p, "");//compilation fail
//                     ^
// 1 error
// error: compilation failed