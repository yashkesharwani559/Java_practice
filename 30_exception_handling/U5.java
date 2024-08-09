public class U5 {
    public static void main(String[] args){
        pro();
    }

    static int pro() {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            return 1;
        }
        return 2;
    }

}

//compilation error at line no 12

// U5.java:12: error: unreachable statement
//         return 2;
//         ^
// 1 error
// error: compilation failed