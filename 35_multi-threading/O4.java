public class O4 {
    public static void main(String[] args) throws InterruptedException {

        OurThread ot = new OurThread();
        ot.start();
        OurThread ot1 = new OurThread();
        ot1.start();
        OurThread ot2 = new OurThread();
        ot2.start();

        ot.sleep(50);
        
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
//here the output changes but it is confirmed that it ends with the
// main always