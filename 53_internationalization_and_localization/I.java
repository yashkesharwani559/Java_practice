import java.util.Calendar;
import java.util.Date;

public class I {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(new Date(calendar.getTimeInMillis()));

        // calendar.add(Calendar.DATE, 36);//this will increase the date by calculating
        // it and also increases the month by one because 36 is not possible in any
        // month.

        // calendar.add(Calendar.DATE, -5);//it decreases the date by 5

        // calendar.add(Calendar.DATE, -35);// it decreases the date by 35

        calendar.add(Calendar.DATE, 5);// this increases the date by 5

        System.out.println(new Date(calendar.getTimeInMillis()));

    }
}
// void add(int field, int amount) -> this is a method in the Calendar
// interface. This is a static method and it returns void means this method
// returns nothing. This add() method takes two arguments/
// 1. it takes an int value that is predefined using the fields of the Calendar
// interface
// 2. second it takes the amount of time to increase or decrease the old time.
// so mainly first one is used for the type that is it an hour, a minute or
// anything else.
// here if we take an example of the DATE, that can have maximum 31 as value,
// but if we pass more than this in the second argument, then this just increase
// the months to increase the DATE according to the given argument.