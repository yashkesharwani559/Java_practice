import java.util.regex.Pattern;

public class C {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("hello");//correct
        System.out.println(p);//hello
    }
}

// public static Pattern compile(String regex) -> here this takes the regex or simple string in the form of String and returns the object of the Pattern class

// public static Pattern compile(String regex, int f) -> here this takes the regex or simple string in the form of String and int flags as argument and returns the object of the Pattern class
// here in the int flags we pass the constants that are predefined in the Pattern class
// one example of the constant is the CASE_INSENSITIVE whoose value is 2
// here the constants are public static final 