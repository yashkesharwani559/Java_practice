class A {
    private String x = "om";

    void pro() {
        System.out.println(x);
    }
    A() {
        System.out.println("--------A--------");
        
        System.out.println("A" + x);
        pro();
    }
}

class B extends A {
    

    B() {
        System.out.println("--------B--------");

        pro();
    }
}

class C extends B {

    C(){
        System.out.println("--------C--------");

        pro();
    }
}

public class H2 {
    public static void main(String[] args) {
        C x = new C();

        System.out.println("---------main----------");
        x.pro();
    }
}