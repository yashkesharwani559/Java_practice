public class X {
    public static void main(String[] args) {

        OThread t = new OThread();
        t.setName("AAA");
        t.start();

        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 20; i++) {
            System.out.println(t1.getName());
        }

    }
}

class OThread extends Thread {
    public void run() {
        Thread t = currentThread();
        for (int i = 0; i < 20; i++) {
            yield();
            System.out.println(t.getName());
        }
    }

    public static void yield() {
        System.out.println("going to Runnable state");
        Thread.yield();
    }
}

//output
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
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA
// going to Runnable state
// AAA