public class L {
    static L a = new L();
    public static void main(String[] args) {
        LThread l1 = new LThread();
        LThread2 l2 = new LThread2();
        l1.start();
        l2.start();
    }

    synchronized void pro() {
        for (int i = 0; i < 5000; i++)
            System.out.println("pro");
    }

    void pro2() {
        for (int i = 0; i < 5000; i++)
            System.out.println("pro2");
    }
}
//here the outputs will be printed concurrently because both the methods are running concurrently in different threads.

class LThread extends Thread{
    public void run(){
        L.a.pro();
    }
}

class LThread2 extends Thread{
    public void run(){
        L.a.pro2();
    }
}

