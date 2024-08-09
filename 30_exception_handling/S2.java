public class S2 {
    public static void main(String[] args) {
        System.out.println(1);
    }
    
    static int pro(){
        return 0;
        throw new ArithmeticException();
    }
    
}
//this will give compilation error at line no 8 because line no. 8 is never reached because the pro() method pops from the stack when the return or throw statement comes

// S2.java:8: error: unreachable statement
//         throw new ArithmeticException();
//         ^
// 1 error
// error: compilation failed
