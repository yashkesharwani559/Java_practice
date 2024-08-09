import java.util.Locale;

public class K {
    public static void main(String[] args) {

        // Locale local = new Locale("");//prints nothing

        // Locale local = new Locale(null); //throws NullPointerException

        // Locale local = new Locale("hello");//prints hello without any error

        Locale local = new Locale("en");

        System.out.println(local);//en

    }
}
// Locale -> is a class in java.util package.
// it has three constructors. but here we are studying two of them.
// Locale(String language) -> here it takes language code of a particular
// language as input.
// This throws NullPointerException if the String passed is null;

// for getting the language code:- just write "language code wikipedia" on the google search and then press enter.