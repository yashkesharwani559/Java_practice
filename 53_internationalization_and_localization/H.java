import java.util.Date;
import java.util.Calendar;

public class H {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();

        Date d = new Date(calendar.getTimeInMillis());

        System.out.println(d);

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        // here it prints 3 because this time it is tuesday.
        
    }
}
// DAY_OF_WEEK -> is a field in Calendar interface, that contains the value that represents the day of the week. We should also know that 0=sunday .... 7=saturday and that's how 3=tuesday