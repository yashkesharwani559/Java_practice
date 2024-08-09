public class G3 {
    public static void main(String[] args){
        String s = "";

        System.out.println(s.charAt(0));
    }
}
//this will give runtime exception as
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
//         at java.base/java.lang.String.charAt(String.java:693)
//         at G3.main(G3.java:5)

//this is because the string is empty and then how we can get the character at index anything