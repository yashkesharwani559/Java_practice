class D1 {
    int x;

    void pro() {
        System.out.println("hello");
    }

    class EE {
        EE() {
            System.out.println("EE");
        }
    }

    public static void main(String[] args) {
        D1 d = new D1();
        System.out.println(d.x);
        d.pro();
        d.new EE();
    }
}
//means regular inner class is treated as an instance member of the outer class.

//output
// 0
// hello
// EE