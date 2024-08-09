public class K3 extends A {
    private void pro(){}
}

class A{
    void pro(){}//default
}


//this will give compilation error at line 2 as

// K3.java:2: error: pro() in K3 cannot override pro() in A
//     private void pro(){}
//                  ^
//   attempting to assign weaker access privileges; was package
// 1 error
// error: compilation failed