public class O2 {
    public static void main(String[] args) throws InterruptedException {

        OurThread ot = new OurThread();
        ot.start();

        OurThread.sleep(1000);//same as below
        Thread.sleep(1000);//both are same as below because sleep(long) is a static method.

        ot.sleep(1000);//this will put the main thread in the sleep state because here sleep(long) method sleeps that thread from which this method is called.
        // And here it is called from main thread so main thread would be go to sleep state for 1000millisecond = 1millisecond and till that time other thread will complete their execution and are dissolved
        Thread t = Thread.currentThread();

        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

class OurThread extends Thread {
    public void run() {

        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

//so here the Thread-0 will complete its execution and dissolved and takes a pause after it the main thread runs
//output
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main