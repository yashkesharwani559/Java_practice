public class Q {
    public static void main(String[] args) {

        try {
            throw new Throwable();
            throw new Exception();//compilation error 
        } catch (Throwable e) {
            System.out.println(e);
        }

    }
}

//this is because there can be only one throw statement in a try block in java

//compilation error

// Q.java:6: error: unreachable statement
//             throw new Exception();//compilation error
//             ^
// 1 error
// error: compilation failed