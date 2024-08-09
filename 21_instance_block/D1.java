

public class D1 extends A {
    static {
        System.out.println("C");

    }

    D1() {
        System.out.println("D");
    }

    public static void main(String[] args){
      
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

//this will print output as
// A
// C

// this is because we have not called the constructor