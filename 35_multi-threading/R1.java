public class R1 {
    public static void main(String[] args) throws InterruptedException {
        RThread rt = new RThread();
        rt.setName("RT");
        rt.start();
        rt.join();

        Thread main = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(main.getName());

    }
}
// here the main thread will be blocked till the time when the RT thread is not
// executed and dissolved And once the RT thread is dissolved then the main
// thread automatically comes to the Runnable state.

class RThread extends Thread {
    public void run() {
        Thread t = currentThread();

        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

// output
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
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