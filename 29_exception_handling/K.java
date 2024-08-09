// stacktrace in java
public class K {
    public static void main(String[] args) {
        System.out.println("main");
        aaa();
        System.out.println("main1");
    }
    
    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("A1");
    }

    static void bbb() {
        System.out.println("B");
        ccc();
        System.out.println("B1");
    }

    static void ccc() {
        System.out.println("C");
        int x = 12 / 0;
        System.out.println("C1");
    }
}

//output
// main
// A
// B
// C
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at K.ccc(K.java:23)
//         at K.bbb(K.java:17)
//         at K.aaa(K.java:11)
//         at K.main(K.java:5)

//this above is the stack trace
// but in the stack trace first line has the type of exception is given 
//and from the second line it starts giving exception from the main source of exception 
//so don't be afraid of seeing the long stack trace the only line where the exception comes is the first line where the first method is declared
//here the exception transfers from method to method so it is called exception propagation