import java.text.NumberFormat;

public class Q {
    public static void main(String[] args) {
        float amt = 34.5634f;

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println(nf.format(amt));

    }
}
//output
// ? 34.56