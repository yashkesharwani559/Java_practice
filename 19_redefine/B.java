public class B extends C{
    void set() {
        System.out.println("abcd");
    }
    public static void main(String[] args){
        C x = new B();

        x.set();
    }
}
//this will print abcd because of runtime polymorphism (dynamic method dispatch)
class C{
    void set(){
        System.out.println("xyz");
    }
}