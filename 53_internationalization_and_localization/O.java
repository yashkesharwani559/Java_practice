import java.util.Date;
import java.text.DateFormat;

public class O {
    public static void main(String[] args) {

        Date dt = new Date();

        DateFormat df = DateFormat.getInstance();

        String date = df.format(dt);

        System.out.println(df instanceof DateFormat);

        System.out.println(date);

    }
}

// Date is a concrete class in java, that is present in java.util package.
// Date() no parameterized constructor returns the object of Date class of
// current time.

// public abstract class DateFormat extends Format -> DateFormat is an abstract class in java.text package. Format (parent class) is also an abstract class. Its child class SimpleDateFormat is a concrete class.
//  DateFormat has a protected constructor. 
// To create an object of DateFormat class, we use the getInstance() method.
// public static DateFormat getInstance() -> is a static method in the DateFormat class, that returns a new object of the DateFormat class.

// public String format(Date date) -> it is a one paramterized method in the DateFormat class, that takes Date class object as argument and returns the String where the date is returned in the form of String. Here, this method returns the date in the american format.

