public class K1 {
    static int x = 12/0;

    public static void main(String[] args) {
        
    }
}

//this will give runtime error as
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at K1.<clinit>(K1.java:2)

//here it is giving ExceptionInInitializerError that is caused due to / by zero ArithematicException because exception in static variable stops the class initialization 