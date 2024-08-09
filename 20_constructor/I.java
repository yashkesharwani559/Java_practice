//here in I series we will try to learn super keyword

// super super is basically used to address the parent class in a child class
class A {
    int x;
    public int y;
    protected int z = 34;
    private int a = 23;

}

class B extends A{
    void pro(){
        System.out.println(super.x);
        System.out.println(super.y);
        System.out.println(super.z);
    }
}

public class I {
    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}
