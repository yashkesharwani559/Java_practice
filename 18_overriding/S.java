public class S {
    public static void main(String[] args) {
        A x = new A();
        A x1 = new B();
        A x2 = new C();
        A x3 = new E();
        A x4 = new D();
        A x5 = new E();
        A x6 = new F();

        x.pro();//A

        x1.pro();//B
        x2.pro();//A
        x3.pro();//D
        x4.pro();//D
        x5.pro();//D
        x6.pro();//F
    }    
}


class A{
    void pro() {
    
        System.out.println("A");
    }
}

class B extends A{
    void pro(){
        System.out.println("B");
    }

}

class C extends A {
}

class D extends A{
    void pro(){
        System.out.println("D");
    }
}

class E extends D{

}

class F extends B{
    void pro(){
        System.out.println("F");
    }
}
