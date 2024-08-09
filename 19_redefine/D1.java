class A {
    int x = 45;
}
class B extends A{
    int x = 46;

    void pro(){
        System.out.println(x);
        int x = 47;
    }
}


public class D1 {
    public static void main(String[] args){
        B x = new B();
        x.pro();
    }
}
//this will print 46
