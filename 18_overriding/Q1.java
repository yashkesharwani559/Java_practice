public class Q1 extends A {
    static void pro(){}
}

class A{
    static protected void pro(){}
}

//this will give compilation error at line 2 as
// Q1.java:2: error: pro() in Q1 cannot override pro() in A
//     static void pro(){}
//                 ^
//   attempting to assign weaker access privileges; was protected
// 1 error
// error: compilation failed