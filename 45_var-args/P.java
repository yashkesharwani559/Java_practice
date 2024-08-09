public class P {
    static void pro(String[] arr){}
    static void pro(String... arr){}
    //compilation fail because of not a successfull overloading because array and var-args are same.
}


// P.java:3: error: cannot declare both pro(String...) and pro(String[]) in P
//     static void pro(String... arr){}
//                 ^
// 1 error
// error: compilation failed