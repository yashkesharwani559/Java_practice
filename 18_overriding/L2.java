public class L extends A {
    void pro(){}//default
}

class A{
    protected void pro(){}
}
//compilation error at line 2

// L2.java:2: error: pro() in L cannot override pro() in A
//     void pro(){}//default
//          ^
//   attempting to assign weaker access privileges; was protected
// 1 error
// error: compilation failed