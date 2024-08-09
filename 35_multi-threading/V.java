public class V {
    public static void main(String[] args) {
        TThread t = new TThread();
        t.setName("Ram");
        t.start();

        
        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 20; i++) {
            // t.yield();
            Thread.yield();//same as above
            // TThread.yield();//same as above
            System.out.println(t1.getName());
        }
    
    }
}

class TThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++) {
            System.out.println(t.getName());
        }
    }
}

//it is upto the Thread scheduler that it will move the thread back to Runnable state or not
//output
// main
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
// Ram
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