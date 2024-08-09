public class D1 {
    public static void main(String[] args) {

    }

    static void pro(String... x) {

    }

    static void pro(String[] y) {

    }//compilation error 
     // it is because we can use the var-arg in place of the array and that will be correct. This is the reason why it is giving an error because var-args can handle the working of array also.
}

// D1.java:8: error: cannot declare both pro(String[]) and pro(String...) in D1
//     static void pro(String[] y){
//                 ^
// 1 error
// error: compilation failed