import java.util.Locale;

public class N {
    public static void main(String[] args) {

        Locale lc = new Locale("pt", "BR");
        Locale lc1 = new Locale("zt", "CN");
        Locale lc2 = new Locale("da", "DK");
        Locale lc3 = new Locale("fr", "FR");

        System.out.println(lc.getDisplayCountry());
        System.out.println(lc.getDisplayLanguage());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        
        System.out.println(lc.getDisplayCountry(lc1));
        System.out.println(lc.getDisplayLanguage(lc1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println(lc.getDisplayCountry(lc2));
        System.out.println(lc.getDisplayLanguage(lc2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println(lc.getDisplayCountry(lc3));
        System.out.println(lc.getDisplayLanguage(lc3));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
// public String getDisplayCountry(Locale locale) -> it is the overloaded
// version of the getDisplayCountry() no parameterized method. This will return
// the Country name according to the locale object passed as the argument and
// return this country name in the form of String

//output
// Brazil
// Portuguese
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Brazil
// Portuguese
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Brasilien
// portugisisk
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Brésil
// portugais
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
