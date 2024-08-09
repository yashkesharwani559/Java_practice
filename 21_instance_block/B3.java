class A {
    {
        System.out.println("A instance");
        
    }
    
    A() {
        System.out.println("A constructor");
        
    }
}

public class B3 extends A {
    {
        System.out.println("B3 instance");
        
    }
    
    B3(){
        
        System.out.println("B3 constructor");
    }

    public static void main(String[] args){
        B3 x = new B3();
    }
}

//this will give output as
// A instance
// A constructor
// B3 instance
// B3 constructor