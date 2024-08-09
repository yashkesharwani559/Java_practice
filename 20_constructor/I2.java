class A {
    void pro() {
        System.out.println("A");
    }
}

class B extends A{
    void pro(){
        System.out.println("B");
        super.pro();
    }
}

public class I2 {
    public static void main(String[] args){
        B x = new B();

        x.pro();
    }
}

//super keyword is also used to call the overridden method version of parent class in the methods of the child class
//this is the main use of super keyword

//this will print 
// B
// A
