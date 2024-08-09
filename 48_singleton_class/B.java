public class B {
    public static void main(String[] args){
        B a = new B();
        B a1 = new B();
        B a2 = new B();

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        //all above are different, because by default, no user-defined class is a singleton class.

    }
}
