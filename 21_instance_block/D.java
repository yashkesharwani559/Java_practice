

public class D extends A {
    static {
        System.out.println("C");

    }

    D() {
        System.out.println("D");
    }

    public static void main(String[] args){
        D x = new D();
    }
}

class A{
    static{
        System.out.println("A");
    }
    A(){
        System.out.println("B");
    }
}

//this will give output as
// A
// C
// B
// D