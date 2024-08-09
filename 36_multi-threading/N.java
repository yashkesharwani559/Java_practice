class N {
    static N a = new N();
    static N b = new N();

    public static void main(String[] args) {
        Thread t1 = new Thread(new ZRunnable(), "Kaliya");
        Thread t2 = new Thread(new YRunnable(), "Raju");

        t1.start();
        t2.start();
    }
}
//prints mix output because both the synchronized block are running on different object
class ZRunnable implements Runnable {
    public void run() {
        synchronized(N.a) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}

class YRunnable implements Runnable {
    public void run() {
        synchronized(N.b) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}
