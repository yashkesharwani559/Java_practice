class A{
    private A(){}
}

public class Q1 extends A{
    Q1(){

    }
}


//this will give compilation error as
// Q1.java:6: error: A() has private access in A
//     Q1(){
//         ^
// 1 error