public class B2 {
    B2(int x, float y) {
        System.out.println("abcd");
    }

    public static void main(String[] args) {
        // B2 b2 = new B2(3.5, 4);
    }
}
// here it will give error as int is not compatible with the float values in
// java

// B2.java:7: error: incompatible types: possible lossy conversion from double
// to int
// B2 b2 = new B2(3.5, 4);
// ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to
// get full output
// 1 error
// error: compilation failed