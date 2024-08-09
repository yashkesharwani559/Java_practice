public class A7 {
    public static void main(String[] args) {
        String s = null;// correct

        s = "1Ab~\t\n\u0065'\"\3";// correct
        // output
        // 1Ab~
        // e'"

        s = "\\\u0010h";//\h
        s = "\\\\u0010h";//u0010h

        s = "\3";//legal escape character
        // s = "\U";//illegal escape character
        // s = "\a";//illegal escape character
        // this is because there are predefined legal characters in java
        System.out.println(s);
    }
}
