public class R {
    public static void main(String[] args) {
        A x = new A();
        x.pro();//A

        B y = new B();
        y.pro();// B  A

        A z = new B();
        z.pro();//B   A//runtime polymorphism
    }
}

class A{
    void pro(){
        System.out.println("A");
    }
}

class B extends A{
    void pro(){
        System.out.println("B");
        super.pro();
    }
}


//method overriding is used to perform Runtime polymorphism in java

//and the method or way the java will do this is called Dynamic Method Dispatch
// So dynamic method dispatch is that when java at the runtime checks the object in the variable and runs the method version of the class whoose object is there