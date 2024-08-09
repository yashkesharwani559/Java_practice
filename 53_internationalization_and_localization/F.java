import java.util.Calendar;
import java.util.Date;

public class F {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTimeInMillis());
        System.out.println(new Date(calendar.getTimeInMillis()));

    }
}

//output
// 1708368688414
// Tue Feb 20 00:21:28 IST 2024

// public Calendar static getInstance() -> getInstance() is a static method in
// the Calendar interface that returns the Calendar interface type object means
// its child GregorianCalendar class object by setting its time by default the
// time of execution
