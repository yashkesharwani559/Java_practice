public class S1 {
    public static void main(String[] args) {
        System.out.println(1);
        pro();
    }
    static int pro(){
        System.out.println(12);
        throw new ArithmeticException();
        System.out.println(23);
    }
}
//compilation fail because line no 9 will never run

// S1.java:9: error: unreachable statement
//         System.out.println(23);
//         ^
// S1.java:10: error: missing return statement
//     }
//     ^
// 2 errors
// error: compilation failed
