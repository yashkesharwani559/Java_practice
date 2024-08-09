public class L2 {
    static String s;
    public static void main(String[] args){

        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("0"));
        System.out.println(s.lastIndexOf("0"));
        System.out.println(s.startsWith("0"));
    }
}
//this will give NullPointerException at any method calling because null is assigned on the variable s
// runtime exception as
// Exception in thread "main" java.lang.NullPointerException
//         at L2.main(L2.java:5)