import java.util.Calendar;
import java.util.GregorianCalendar;

public class D {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        System.out.println(calendar);
        //java.util.GregorianCalendar[time=1708367115166,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=50,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=55,SECOND=15,MILLISECOND=166,ZONE_OFFSET=19800000,DST_OFFSET=0]

    }
// 
}

// 
// 
// Calendar -> it is an interface in the java.util package. There is a GregorianCalendar subclass of the Calendar interface. Calendar interface contains all the classes
// since it is an interface, so it can only store the object of it child class i.e. the object of the GregorianCalendar class.

// GregorianCalendar -> it is a subclass of the Calendar interface. Here in this class, no new method is declared and defined but all the methods of the Calendar interface are implemented by this class.
