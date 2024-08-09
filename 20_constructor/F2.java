public class F2 {
    static int count = 0;

    F2() {
        count++;
    }

    void pro() {
        F2 p = new F2();
        F2 q = new F2();
        F2 r = new F2();
    }

    void pro2() {
        F2 p = new F2();
        F2 q = new F2();
        F2 r = new F2();
    }

    public static void main(String[] args) {
        F2 p = new F2();
        F2 q = new F2();
        System.out.println(p.count);
        System.out.println(q.count);
        F2 a = new F2();
        F2 b = new F2();
        b.pro();
        System.out.println(a.count);
        System.out.println(b.count);
        F2 r = new F2();
        F2 s = new F2();
        b.pro2();
        System.out.println(r.count);
        System.out.println(s.count);
    }
}
//so creating a user defined constructor is useful to count the number of objects created of that class