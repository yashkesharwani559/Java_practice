import java.util.Locale;

public class M {
    public static void main(String[] args) {

        // Locale local = new Locale("pt", "BR");//Portuguese :- language code= "pt",
        // Brazil country code="BR"
        // output
        // pt_BR
        // Brazil
        // Portuguese

        // Locale local = new Locale("zh", "CN");
        // output
        // zh_CN
        // China
        // Chinese

        Locale local = new Locale("da", "DK");
        // output
        // da_DK
        // Denmark
        // Danish

        System.out.println(local);
        System.out.println(local.getDisplayCountry());
        System.out.println(local.getDisplayLanguage());

    }
}
// public String getDisplayCountry() -> this is a method in the Locale class,
// that returns the Name of the country according to the language in the form of
// String.

// public String getDisplayLanguage() -> this is a method in the Locale class,
// that returns the name of the language code according to the country in the
// form of String.
// these no parameterized methods returns the names according to the country America and its Locale