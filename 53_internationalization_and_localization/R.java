import java.text.NumberFormat;
import java.util.Locale;

public class R {
    public static void main(String[] args) {
        float amt = 545.1212f;

        // NumberFormat nf = NumberFormat.getCurrencyInstance();
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        // NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("hi", "IN"));

        System.out.println(nf.format(amt));

    }
}
