public class Z1 {
    public static void main(String[] args){
        pro();
    }
    static int pro(){
        try{
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("solved");
            return 2;
        }
        return 10;
    }
}

//compilation error at line no 12 because it will never run because catch will always run and the program returns from there

// Z1.java:12: error: unreachable statement
//         return 10;
//         ^
// 1 error
// error: compilation failed