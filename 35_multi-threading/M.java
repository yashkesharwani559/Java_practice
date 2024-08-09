public class M {
    public static void main(String[] args) {
        // AThread t = new AThread();
        // Thread thread = new Thread(t);
        // thread.start();

        // this above is same as
        new Thread(new AThread()).start();

        System.out.println(Thread.currentThread().getName());

    }
}

class AThread implements Runnable{

    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t.getName());
    }
}

//output
// main
// Thread-0