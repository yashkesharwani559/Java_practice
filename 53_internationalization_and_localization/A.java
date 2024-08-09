import java.util.Date;

public class A {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        //Mon Feb 19 23:30:34 IST 2024

    }
}

// Internationalization -> In internationalization, nternationalizatio = 18
// characters that's why Internalization = i18n

// Localization -> In localization, ocalizatio = 10 characters that's why
// localization = l10n

// Date -> it is a concrete class in java.util package that is a very raw class
// to determine the date and time.
// In the Date class, only two constructors and other constructors of Date class
// are deprecated. These two constructors are :
// Date() -> this creates an object having the current time.
// Date(long time) -> this creates an object having the time as the time given
// as argument as long value and this long value is in milliseconds. But here we give the time in milliseconds calculated from the 1st January 1970 midnight 12:00:00
// if we pass negative value as argument in this constructor, than this will gives us date that is before the time 1st January 1970 midnight 12:00:00