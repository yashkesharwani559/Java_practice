public class O {
    public static void pro(String[] arr, String... x) {
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");
        for (String s : x) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        pro("A", "B", "C", "D");// compilation fail because String cannot be converted to String[]
    }
}

// O.java:13: error: incompatible types: String cannot be converted to String[]
//         pro("A", "B", "C", "D");// compilation fail because String cannot be converted to String[]
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
// error: compilation failed
