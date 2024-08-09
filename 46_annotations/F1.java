public class F1 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Integer i = new Integer(23);
        System.out.println(i);
    }
}
// here this will run without any warning because here we have used
// @SuppressWarnings() annotation

//output
// 23

// @SuppressWarnings() -> it is a general purpose annotation that is in
// java.lang package, that's why no need to import it. This annotation takes
// name of warning in the form of String which is to be suppressed.