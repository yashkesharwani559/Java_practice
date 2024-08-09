public class L1 {
    String s;
    public static void main(String[] args){

        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("0"));
        System.out.println(s.lastIndexOf("0"));
        System.out.println(s.startsWith("0"));
    }
}
//this will give compilation error as
// L1.java:5: error: non-static variable s cannot be referenced from a static context
//         System.out.println(s.charAt(0));
//                            ^
// L1.java:6: error: non-static variable s cannot be referenced from a static context
//         System.out.println(s.indexOf("0"));
//                            ^
// L1.java:7: error: non-static variable s cannot be referenced from a static context
//         System.out.println(s.lastIndexOf("0"));
//                            ^
// L1.java:8: error: non-static variable s cannot be referenced from a static context
//         System.out.println(s.startsWith("0"));
//                            ^
// 4 errors
// error: compilation failed