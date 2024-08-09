import java.text.NumberFormat;
import java.text.ParseException;

public class U {
    public static void main(String[] args) throws ParseException {

        NumberFormat nf = NumberFormat.getNumberInstance();

        // Number num = nf.parse("23454");//23454 true
        // Number num = nf.parse("2345@4");// 2345 true
        Number num = nf.parse("@23454");//ParseException

        System.out.println(num);
        System.out.println(num instanceof Long);

    }
}
// public Number parse(String value) throws ParseException -> parse() is an
// instance method in the NumberFormat (abstract) class, that takes number
// values in the form of String, and it returns the object of type Number. It
// throws ParseException when the String starts with non-numeric character.
// ParseException is a checked exception present in java.text package.