public class B1 extends C {
    static void set() {
        System.out.println("abcd");
    }

    public static void main(String[] args) {
        C x = new B1();
        x.set();
    }
}
//this will print xyz 

class C{
    static void set(){
        System.out.println("xyz");
    }
}
