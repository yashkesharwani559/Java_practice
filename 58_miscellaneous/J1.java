public class J1 {
    public static void main(String[] args) {
        
        A c = new B();

        System.out.println(c.getClass());//class B
        //because it checks at runtime that the class B object is stored and he will print class B
        
    }
}

class A {
    
}

class B extends A {
    
}