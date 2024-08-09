public class U2 {
    public static void main(String[] args) {
        pro();
    }

    static int pro() {
        try {
            int x = 12/0;
        } catch (ArithmeticException e) {
            return 2;
        }

    }
}
//compilation error as

// U2.java:13: error: missing return statement
//     }
//     ^
// 1 error
// error: compilation failed