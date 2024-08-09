public class G {
    static int[] a;

    public static void main(String[] args) {
        System.out.println(a[0]);
    }
}
//this will give runtime exception as
// Exception in thread "main" java.lang.NullPointerException
//         at G.main(G.java:5)