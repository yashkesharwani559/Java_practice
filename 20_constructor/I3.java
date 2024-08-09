//here we will learn about super() call
// super() call is a call that is used to call child class constructor

class A  {
    A(){
        System.out.println("A");
    }
}

class B extends A {
    B(){
        super();
        System.out.println("B");
    }
}

public class I3 {
    public static void main(String[] args){
        B x = new B();
        // A
        // B
    }    
}
