public class O extends A {
    void pro(){}
}

class A{
    final void pro(){}
}

//this will give error at line 2 because a final method cannot be overridden

//this will give error as
// O.java:2: error: pro() in O cannot override pro() in A
//     void pro(){}
//          ^
//   overridden method is final
// 1 error
// error: compilation failed

