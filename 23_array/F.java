public class F {
    static char[] a;
    char[] b;

    public static void main(String[] args) {
        
        F f = new F();
        System.out.println("A");
        System.out.println(f.b);
        System.out.println(a);

    }
}

//this will give exception as
// xception in thread "main" java.lang.NullPointerException
//         at java.base/java.io.Writer.write(Writer.java:213)
//         at java.base/java.io.PrintStream.write(PrintStream.java:582)
//         at java.base/java.io.PrintStream.print(PrintStream.java:732)
//         at java.base/java.io.PrintStream.println(PrintStream.java:868)
//         at F.main(F.java:8)
