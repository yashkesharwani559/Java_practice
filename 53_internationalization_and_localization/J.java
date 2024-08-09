import java.util.Calendar;
import java.util.Date;

public class J {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(new Date(cal.getTimeInMillis()));

        // cal.set(0, -5);//IllegalArgumentException
        // if we pass any random value as first argument, then it will give
        // IllegalArgumentException
        // same for the add() and roll() method

        // cal.add(0, 5);//correct
        // cal.add(-1, 5);//IllegalArgumentException

        cal.roll(0, 5);//correct
        cal.roll(-1, 5);//IllegalArgumentException

        // so we can say that for the first argument f,
        // set() -> f<=0; add() & roll() -> f<0 then in this condition it gives the IllegalArgumentException.

        System.out.println(new Date(cal.getTimeInMillis()));

    }
}
