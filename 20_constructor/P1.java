class A{
    private A(){

    }
}

public class P1 {
    public static void main(String[] args){
        A x = new A();
    }
}

//this will give compilation error as
// P1.java:9: error: A() has private access in A
//         A x = new A();
//               ^
// 1 error