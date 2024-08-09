public class P extends A {
    static int pro() {
    return 0;}
}

class A{
    static void pro(){}
}
//compilation error at line 2 as

// P.java:2: error: pro() in P cannot hide pro() in A
//     static int pro() {
//                ^
//   return type int is not compatible with void
// 1 error
// error: compilation failed