public class T1 {
    public static void main(String[] args) {
        pro();
    }

    static int pro() {
        if (12 < 13) {
            return 12;
        } else {
            return 2;
        }

        return 0;
    }
}

//compilation error at line no 13

// T1.java:13: error: unreachable statement
//         return 0;
//         ^
// 1 error
// error: compilation failed