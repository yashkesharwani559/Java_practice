public class E1 extends EE1 {
    @Override
    void pro(int x) {//compilation fail
        System.out.println("hello");
    }

    public static void main(String[] args) {
        EE1 e = new E1();
        e.pro(12);//hello
    }
}
//this will give compilation error because the method signature of pro() in the child class is not same as that in the parent class and @Override is applicable only on overridden method.

class EE1{
    void pro(float x){
        System.out.println("hii");
    }
}

// E1.java:2: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error
// error: compilation failed
