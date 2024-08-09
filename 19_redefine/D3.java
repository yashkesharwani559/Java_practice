public class D3 {
    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}

class A {
    int x = 45;
}

interface C {
    int x = 345;
}

class B extends A implements C {
    // int x = 46;

    void pro() {
        System.out.println(super.x);//this will print 45
    }
}
// here we learnt from this example that it is not possible to access the interface members using the super keyword and that's why super.x will print value of x in parent class A that is 45

