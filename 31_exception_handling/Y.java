public class Y {
    static int i;

    public static void main(String[] args) {
        pro();
    }
    
    static void pro(){
        System.out.println(i++);
        pro();
    }
    
}
//StackOverFlowError
//output
// .
// .
// .
// .
// .
// .
// 9462
// 9463
// 9464
// 9465
// 9466
// 9467
// 9468
// 9469
// 9470
// Exception in thread "main" java.lang.StackOverflowError
//         at java.base/java.io.PrintStream.write(PrintStream.java:605)
//         at java.base/java.io.PrintStream.print(PrintStream.java:676)
//         at java.base/java.io.PrintStream.println(PrintStream.java:812)
//         at Y.pro(Y.java:9)
//         at Y.pro(Y.java:10)
//         at Y.pro(Y.java:10)
//         at Y.pro(Y.java:10)