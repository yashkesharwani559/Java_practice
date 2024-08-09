class A {
    String x = "om";

    A() {
        System.out.println("--------A--------");
        
        System.out.println("A" + x);
    }
}

class B extends A {
    boolean y = true;

    B() {
        System.out.println("--------B--------");
        System.out.println("A" + x);
        System.out.println("B  "+ y);
    }
}

class C extends B {
    int  z = 45;
    C(){
        System.out.println("--------C--------");
        System.out.println("A" + x);
        System.out.println("B  "+ y);
        System.out.println("C  " +z);
    }
}

public class H1 {
    public static void main(String[] args) {
        C x = new C();
        System.out.println("H");
    }
}

//this will print output as
// --------A--------
// Aom
// --------B--------
// Aom
// B  true
// --------C--------
// Aom
// B  true
// C  45
// H
