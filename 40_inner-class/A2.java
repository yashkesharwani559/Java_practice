public interface A2 {
    class A {

    }

    interface B {

    }
}
// the class/interface created inside the interface is 'public static' by default.

class AA{
    public static void main(String[] args){
        // A2.A a = A2.new A();//not allowed
        A2.A a = new A2.A();//allowed
    }
}