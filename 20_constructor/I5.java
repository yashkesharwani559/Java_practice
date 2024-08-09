public class I5 {
    public static void main(String[] args){
        B x = new B();
    }    
}
class A  {
    A(){
        System.out.println("A");
    }
}

class B extends A {
 
    B(){
        System.out.println("B");
        super();
    }
}

//this will give error on line 16 because super() call ought to be a first line statement

// I5.java:16: error: call to super must be first statement in constructor
//         super();
//              ^
// 1 error
