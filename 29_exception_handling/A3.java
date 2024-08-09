public class A3 {
    public static void main(String[] args) {
        
        System.out.println(1);

        int x = Integer.parseInt("yh");

        System.out.println(2);

    }
}

//output
// 1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "yh"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)
//         at java.base/java.lang.Integer.parseInt(Integer.java:770)
//         at A3.main(A3.java:6)

//this above is the stack trace