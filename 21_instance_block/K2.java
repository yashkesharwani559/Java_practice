public class K2 {
    int x = 1/0;
    public static void main(String[] args){
        K2 x = new K2();
    }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at K2.<init>(K2.java:2)
//         at K2.main(K2.java:4)
