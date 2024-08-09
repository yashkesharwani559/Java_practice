import java.text.NumberFormat;
import java.text.ParseException;

public class U1 {
    public static void main(String[] args) throws ParseException {

        NumberFormat nf = NumberFormat.getNumberInstance();

        Number num = nf.parse("23.454");//23.454   true
        // Number num = nf.parse("23.454f");//23.454    true

        System.out.println(num);
        System.out.println(num instanceof Double);

    }
}