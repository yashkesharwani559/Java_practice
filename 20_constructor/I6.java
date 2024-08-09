public class I6 {
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
        super();
        super();
        System.out.println("B");
    }
}

//this will give error at line 15 because there can be only one super() call in a constructor

// I6.java:16: error: call to super must be first statement in constructor
//         super();
//              ^
// 1 error