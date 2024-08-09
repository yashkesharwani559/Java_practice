import java.util.Calendar;
import java.util.Date;

public class I1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(new Date(cal.getTimeInMillis()));

        // cal.set(Calendar.DATE, 20);// it sets the date to 20

        // cal.set(Calendar.DATE, 40);// it sets the date by calculating it with
        // increasing the month also

        // cal.set(Calendar.DATE, -5);// this takes the date 1 from that month and after
        // it, it decreases the dates
        // from the one before month and therefore both the month anddate changes

        cal.set(Calendar.DATE, -35);// this will decrease 2 months because 35is not a date in any month

        System.out.println(new Date(cal.getTimeInMillis()));

    }
}
// void set(int field, int amount) -> this is a method in the Calendar
// interface, that returns void means returns nothing. set() method takes two
// arguments.
// 1. first it takes the predefined field of the Calendar interface, to indicate
// that which one is to modify.
// 2. second one it takes the value which is to be set in the old date.
//