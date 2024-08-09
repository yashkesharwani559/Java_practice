import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z3 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("^[\\w-]+@([\\w-]+\\.)[\\w-]{2,4}$");
       
        // Matcher m = p.matcher("yash.com@gmail.com");//not matched
        Matcher m = p.matcher("yashcom@gmail.com");//matched
        // Matcher m = p.matcher("yash@com@gmail.com");//not matched

        System.out.println("yash@gmail.com");
        System.out.println("^[\\w-\\.]+@([\\w-]+\\.)[\\\\w-]{2,4}$");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (m.lookingAt()) {
            System.out.println("Match Found: " + m.group());
        }//same as matches() method
    }
}
