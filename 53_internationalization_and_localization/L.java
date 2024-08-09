import java.util.Locale;

public class L {
    public static void main(String[] args) {

        // Locale local = new Locale("", "");//this prints nothing

        // Locale local = new Locale(null, "");// NullPointerException
        // Locale local = new Locale("", null) ;//NullPointerException
        // Locale local = new Locale(null , null);//NullPointerException

        // Locale local = new Locale("US", "en");//en_US

        Locale local = new Locale("CN", "en"); //cn_EN //wrong match

        System.out.println(local);
    }
}
// Locale(String country, String language) -> here this constructor is two
// parameterized. Here in the first, we pass the country code in the form of
// String and in the second, we pass the language code in the form of String.
// This also throws NullPointerException if passed arguments are null