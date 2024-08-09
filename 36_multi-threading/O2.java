public class O2 {
    static O2 o = new O2();

    public static void main(String[] args) {
        O1Thread o1 = new O1Thread();
        O1Thread o2 = new O1Thread();
        o1.setName("A1");
        o2.setName("B1");

        o1.start();
        o2.start();

    }

    void inst() {
        Thread t = Thread.currentThread();
        synchronized (this) {
            System.out.println(t.getName());
        }
        synchronized (this) {
            System.out.println(t.getName());
        }
        synchronized (this) {
            System.out.println(t.getName());
        }
        synchronized (this) {
            System.out.println(t.getName());
        }
    }
}
//so we can say that we can create multiple synchronized block in the same method

//output
// A1
// A1
// A1
// A1
// B1
// B1
// B1
// B1
class O1Thread extends Thread {
    public void run() {
        O2.o.inst();
    }
}
