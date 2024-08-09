import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class O2 {
    public static void main(String[] args) {

        Date dt = new Date();

        System.out.println(dt);

        DateFormat df = null;

        // Locale lc = new Locale("fr","FR");
        // Locale lc = new Locale("da","DK");
        Locale lc = new Locale("pt", "BR");

        System.out.println("~~~~~~~~~~~~ $ ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance();
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ DEFAULT ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.DEFAULT, lc);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ FULL ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.FULL, lc);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ LONG ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.LONG, lc);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ MEDIUM ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, lc);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ SHORT ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.SHORT, lc);
        System.out.println(df.format(dt));

    }
}