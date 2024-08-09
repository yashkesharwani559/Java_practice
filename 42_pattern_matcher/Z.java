import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d{3,}");//no match found
        
        Matcher m = p.matcher("9734@#~^8932447$!*72_-_3+-_765");

        System.out.println("9734@765");
        System.out.println("\\d{3}");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (m.matches()) {
            System.out.println("Match Found: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
        if (m.matches()) {
            System.out.println("Match Found: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
        if (m.matches()) {
            System.out.println("Match Found: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }

    }
}

// public boolean matches() -> this is a method that attempts to match the
// pattern from the starting to the end of the target String and if it is matched then only
// it returns true. otherwise it returns false.
// here if we call the matches() method again and again it will check the same
// result everytime means always checks it from the whole String