public class O3 {
    public static void main(String[] args) throws InterruptedException {

        OurThread ot = new OurThread();
        ot.start();
        OurThread ot1 = new OurThread();
        ot1.start();
        OurThread ot2 = new OurThread();
        ot2.start();

        ot.sleep(50);
        ot1.sleep(450);
        ot2.sleep(30);
        
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
//same output
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