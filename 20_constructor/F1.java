public class F1 {
    int count = 0;

    F1() {
        count++;
    }

    void pro() {
        F1 p = new F1();
        F1 q = new F1();
        F1 r = new F1();
    }

    void pro2() {
        F1 p = new F1();
        F1 q = new F1();
        F1 r = new F1();
    }

    public static void main(String[] args) {
        F1 p = new F1();
        F1 q = new F1();
        System.out.println(p.count);
        System.out.println(q.count);
        F1 a = new F1();
        F1 b = new F1();
        b.pro();
        System.out.println(a.count);
        System.out.println(b.count);
        F1 r = new F1();
        F1 s = new F1();
        b.pro2();
        System.out.println(r.count);
        System.out.println(s.count);
    }
}
// this will give no error but will print all the values as 1 because here count
// is a class level variable but it is an instance variable that's why every
// object has its owninstance variable
