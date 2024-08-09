public class H1 extends A {
    C pro() {//compilation error will occur here
        return null;
    }
}

class A{
    D pro() {
    
        return null;
    }
}

class C{

}

class D extends C{

}

//this will give error as
// H1.java:2: error: pro() in H1 cannot override pro() in A
//     C pro() {
//       ^
//   return type C is not compatible with D
// 1 error
// error: compilation failed

// error at line 2
// it is because method with child class return type when overridden into child class then the return type cannot be changed to parent class