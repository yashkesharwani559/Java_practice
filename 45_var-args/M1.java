public class M1 {
    static void info(float x, String... w) {
        System.out.println(x);

        for (String next : w) {
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        info("A", "B", "C", "D");//compilation fail because String is not convertible to float
    }
}


// M1.java:10: error: incompatible types: String cannot be converted to float
//         info("A", "B", "C", "D");//compilation fail because String is not convertible to float
//              ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
// error: compilation failed