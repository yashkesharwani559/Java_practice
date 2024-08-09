class G2 extends A {
    byte pro(){}    
}

class A{
    int pro(){

    }
}
//compilation error at line 2
// G2.java:2: error: pro() in G2 cannot override pro() in A
//     byte pro(){}
//          ^
//   return type byte is not compatible with int
// 1 error
// error: compilation failed
