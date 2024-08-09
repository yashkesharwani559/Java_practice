public class G extends A {
    int pro()  {//illegal method overriding: compilation error
        return 2;
    }
    
    int pro(int x) {//legal method overloading: no error
     return 2;}
}

class A{
    void pro(){}
}

//this will give compilation error at line 2 because in method overriding method signature must be same 

// G.java:2: error: pro() in G cannot override pro() in A
//     int pro()  {//illegal method overriding: compilation error
//         ^
//   return type int is not compatible with void
// 1 error
// error: compilation failed