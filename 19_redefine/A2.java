public class A2 extends B {
    int x = 34;

    public static void main(String[] args) {
        B x = new A2();
        System.out.println("x: " + x.x);
    }
}
//there is no change if only the parent class variable is static
//this will print x: 23

class B {
    static int x = 23;
}
