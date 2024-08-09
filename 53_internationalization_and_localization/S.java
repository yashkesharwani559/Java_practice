import java.text.NumberFormat;
import java.util.Locale;

public class S {
    public static void main(String[] args) {
        float amt = 545.1212f;

        NumberFormat nf = NumberFormat.getNumberInstance();
        // NumberFormat nf = NumberFormat.getNumberInstance(new Locale("fr", "FR"));
        // NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        // NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hi", "IN"));

        System.out.println(nf.format(amt));

    }
}
// getCurrencyInstance() gives till 2 digit precision, but getNumbetInstance()
// gives 3 digit precision.