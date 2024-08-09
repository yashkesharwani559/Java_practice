public class U {
    void abc(Object x) {
        System.out.println("Object");
    }

    void abc(A x) {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A x = new B();
        A x2 = new A();
        B x3 = new B();
        Object o = new Object();

        U y = new U();

        y.abc(o);//Object
        y.abc(x);//A
        y.abc(x2);//A
        y.abc(x3);//A
    }
}


class A {
    void pro() {

    }
}

class B extends A {
    void pro(){}
}