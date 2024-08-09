public class D1 {
    public static void main(String[] args){
        String s = "mojhan 23432432354";
        System.out.println(s.charAt(-1));
    }
}
//this will give runtime exception because -1 cannot be the index
// as
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
//         at java.base/java.lang.String.charAt(String.java:693)
//         at D1.main(D1.java:4)
