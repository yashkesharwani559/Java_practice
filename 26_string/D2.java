public class D2 {
    public static void main(String[] args){
        String s = "mojhan";
        System.out.println(s.charAt(11));
    }
}
//this will give runtime exception because 11 index is not there in the string
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 11
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
//         at java.base/java.lang.String.charAt(String.java:693)
//         at D2.main(D2.java:4)