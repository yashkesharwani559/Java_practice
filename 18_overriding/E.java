class A{
    void pro(){}
}

class B extends A{
    static void pro(){}
}

//this will give compilation error at line 6 because
// the overriden method must have same method signature means a non static method cannot be marked as static in the child class

// E.java:6: error: pro() in B cannot override pro() in A
//     static void pro(){}
//                 ^
//   overriding method is static
// 1 error
// error: compilation failed