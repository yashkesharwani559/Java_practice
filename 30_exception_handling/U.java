public class U {
    public static void main(String[] args){
        pro();
    }

    static int pro(){
        try{
            return 0;
        } catch (ArithmeticException e) {
            return 2;
        }
        
        return 1;
    }
}

//compilation error at line 13

// U.java:13: error: unreachable statement
//         return 1;
//         ^
// 1 error
// error: compilation failed