public class M {
    static{
        String s = null;
        System.out.println(s.length());//this will give ExceptionInInitializerError 
    }

    public static void main(String[] args){
        System.out.println("main method");
    }
}
// Exception in thread "main" java.lang.ExceptionInInitializerError
//         at java.base/java.lang.Class.forName0(Native Method)
//         at java.base/java.lang.Class.forName(Class.java:398)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:391)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:179)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:119)
// Caused by: java.lang.NullPointerException
//         at A1.<clinit>(A1.java:4)
//         ... 5 more