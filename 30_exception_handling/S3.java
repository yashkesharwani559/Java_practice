public class S3 {
    public static void main(String[] args) {
        System.out.println(1);
    }
    
    static int pro(){
        throw new ArithmeticException();
        return 0;
    }
    
}
//compilation error at line no 8

// S3.java:8: error: unreachable statement
//         return 0;
//         ^
// 1 error
// error: compilation failed