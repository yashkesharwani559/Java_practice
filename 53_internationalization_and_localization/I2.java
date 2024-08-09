import java.util.Calendar;
import java.util.Date;

public class I2 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(new Date(cal.getTimeInMillis()));

        // cal.roll(Calendar.DATE, 20);// adds 50 to the old date but it doesn't updates
        // the month(larger field)
        // if we have to move more than one rounds having same days as in the current
        // month

        // cal.roll(Calendar.DATE, 40);// it sets the date by calculating it but it
        // doesn't increases the month

        // cal.roll(Calendar.DATE, -5);// this decreases the date by 5 but doesn't
        // changes the months

        cal.roll(Calendar.DATE, -35);// this will decrease 2 months because 35is not
        // a date in any month

        System.out.println(new Date(cal.getTimeInMillis()));

    }
}
// void roll(int field, int amount) -> this is a method in the Calendar
// interface, that returns void means returns nothing. set() method takes two
// arguments.
// 1. first it takes the predefined field of the Calendar interface, to indicate
// that which one is to modify.
// 2. second one it takes the value which is to be added or subtracted in the
// old date.
// so it is same as the add() method but if we pass the greater values then also
// it updates with same cycle, but it doesn't changes the larger fields.
// so we can simply say that roll() method works as the anything(DATE, DAY,
// MONTH) are cyclic in nature and no one changes its larger fields on addition
// or substraction