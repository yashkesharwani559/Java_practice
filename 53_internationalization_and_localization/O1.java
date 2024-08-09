import java.util.Date;
import java.text.DateFormat;

public class O1 {
    public static void main(String[] args) {
        
        Date dt = new Date();

        System.out.println(dt);

        DateFormat df = null;

        System.out.println("~~~~~~~~~~~~ $ ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance();
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ DEFAULT ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ FULL ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ LONG ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df.format(dt));

        System.out.println("~~~~~~~~~~~~ MEDIUM ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(dt));
        
        System.out.println("~~~~~~~~~~~~ SHORT ~~~~~~~~~~~~~~");

        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(dt));

    }
}

//output
// Mon Feb 26 18:24:19 IST 2024
// ~~~~~~~~~~~~ $ ~~~~~~~~~~~~~~
// 26-Feb-2024
// ~~~~~~~~~~~~ DEFAULT ~~~~~~~~~~~~~~
// 26-Feb-2024
// ~~~~~~~~~~~~ FULL ~~~~~~~~~~~~~~
// Monday, 26 February, 2024
// ~~~~~~~~~~~~ LONG ~~~~~~~~~~~~~~
// 26 February 2024
// ~~~~~~~~~~~~ MEDIUM ~~~~~~~~~~~~~~
// 26-Feb-2024
// ~~~~~~~~~~~~ SHORT ~~~~~~~~~~~~~~
// 26/02/24

//means from above we can say that when we pass nothing, and when we pass DEFAULT or SHORT than all are same.

// public static getDateInstance(DateFormat df) -> this is an static method of the 