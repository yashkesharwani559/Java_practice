class A {
    int x = 45;
}
class B extends A{
    int x = 46;

    void pro(){
        int x = 47;
        System.out.println(x);
    }
}


public class D {
    public static void main(String[] args){
        B x = new B();
        x.pro();
    }
}
