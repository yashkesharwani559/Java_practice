class A{
    private A(){}
}

public class Q extends A {
    
}


//this will give error as
// Q.java:5: error: A() has private access in A
// public class Q extends A {
//        ^
// 1 error