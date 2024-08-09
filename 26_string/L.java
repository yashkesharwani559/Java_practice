public class L {
    public static void main(String[] args){
        String s;

        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("0"));
        System.out.println(s.lastIndexOf("0"));
        System.out.println(s.startsWith("0"));
    }
}
//this will give compilation error because local variable s is not initialized
// L.java:5: error: variable s might not have been initialized
//         System.out.println(s.charAt(0));
//                            ^
// 1 error
// error: compilation failed