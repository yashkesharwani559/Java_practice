import java.text.NumberFormat;

public class T {
    public static void main(String[] args) {

        float amt = 34.5653265f;

        NumberFormat nf = NumberFormat.getNumberInstance();

        System.out.println(nf.format(amt));

        nf.setMaximumFractionDigits(5);

        System.out.println(nf.format(amt));
        
    }
}

// 34.565
// 34.56533