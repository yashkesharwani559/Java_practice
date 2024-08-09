public class A1 extends B {
    static int x = 34;

    public static void main(String[] args) {
        B x = new A1();
        System.out.println("x: " + x.x);
    }
}
// there is no changeand no error if only the child class variable is static

// this will print x: 23

class B {
    int x = 23;
}
