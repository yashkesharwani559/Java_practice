public class M {
    private int e = 45;

    void pro() {
        System.out.println(e);
    }

    M() {
        System.out.println(e);
    }

    {
        System.out.println(e);
    }

    class X {
        X() {
            System.out.println(e);
        }

        void pro1() {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        M m = new M();
        System.out.println(m.e);
        m.pro();
        X x = m.new X();
        x.pro1();
    }
}
//output
// 45
// 45
// 45
// 45
// 45
// 45