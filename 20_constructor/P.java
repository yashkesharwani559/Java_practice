class A{
    private A(){

    }
}

public class P extends A {
    
}

//this will give compilation error as
// P.java:7: error: A() has private access in A
// public class P extends A {
//        ^
// 1 error
