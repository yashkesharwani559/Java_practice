class A {
    int x = 45;
}

class B extends A {
    
    int x = 97;
}

public class E1 extends B {
    void pro(){
        System.out.println(super.super.x);
    }
}

//this will give compilation error because super.super.x is not a correct syntax. Basically we can say that super keyword is only used to get the direct parent class members

