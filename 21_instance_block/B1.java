public class B1 {
    int x = 34;

    static int a = 35;

    void pro() {
        System.out.println("pro");
    }

    static void pro1() {
        System.out.println("pro1");
    }

    {
        System.out.println(x);
        // System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        pro();
        pro1();
        pro2();
        pro3();
    }

    static int b = 25;
    int y = 20;

    void pro2() {
        System.out.println("pro2");
    }

    static void pro3() {
        System.out.println("pro3");
    }

    public static void main(String[] args) {
        B1 x = new B1();
    }
}

// this will give compilation error at line 14
// B1.java:14: error: illegal forward reference
// System.out.println(y);
// ^
// 1 error

// so from this we learnt that the instance level variable are accessible to the
// instance block only when variables are declared above the instance block

// this will give output as
// 34
// 35
// 25
// pro
// pro1
// pro2
// pro3