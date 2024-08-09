class A {
    int x = 45;
}

class B extends A{
    B(){
        System.out.println(super.x);
        //use of super keyword
    }
}
public class J1 {
    public static void main(String[] args){
        B x = new B();

    }
}
