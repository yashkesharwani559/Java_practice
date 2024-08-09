//here we will learn about super() call
// super() call is a call that is used to call child class constructor

class A  {
    A(){
        System.out.println("A");
    }
}

class B extends A {
    void pro(){
        super();
    }
}

public class I3 {
    public static void main(String[] args){
        B x = new B();
    }    
}

//this will compilation error on line 12 because a super() call be written only inside a constructor

// I4.java:12: error: call to super must be first statement in constructor
//         super();
//              ^
// 2 errors
