public class L extends A {
    private void pro(){}//private
}

class A{
    protected void pro(){}
}

//compilation error at line 2 as

// L3.java:2: error: pro() in L cannot override pro() in A
//     private void pro(){}//private
//                  ^
//   attempting to assign weaker access privileges; was protected
// 1 error
// error: compilation failed