public class L {
    static void pro(int... x, float... y) {
        
    }
}
//compilation fail because there can be only one var args at a time in the parameter and it should be at the last

// L.java:2: error: varargs parameter must be the last parameter
//     static void pro(int... x, float... y) {
//                            ^
// 1 error
// error: compilation failed