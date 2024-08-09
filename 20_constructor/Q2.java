class A{
    private A(){}
}
 
public class Q2 extends A {
    Q2(){
        super();
    }
}


//this will give compilation error as 
// Q2.java:7: error: A() has private access in A
//         super();
//         ^
// 1 error