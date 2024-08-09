import java.util.Calendar;
import java.util.Date;

public class G {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Date d = new Date(calendar.getTimeInMillis());

        System.out.println(d);

        System.out.println("Date: " + calendar.get(Calendar.DATE));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
        System.out.println("Milliseconds: " + calendar.get(Calendar.MILLISECOND));

    }
}

//output
// Tue Feb 20 00:26:57 IST 2024
// Date: 20
// Hour: 0
// Minute: 26
// Second: 57
// Milliseconds: 255


//Calendar interface contains many public static final fields that are predefined.
// HOUR -> current hour in the object
// MINUTE -> current minute in the object
// SECOND -> current seconds in the object
// MILLISECOND -> current milliseconds in the object
// DATE -> current date in the object

