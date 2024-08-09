class N1 {
    static N1 a = new N1();
    static N1 b = new N1();

    public static void main(String[] args) {
        Thread t1 = new Thread(new ZRunnable(), "Kaliya");
        Thread t2 = new Thread(new YRunnable(), "Raju");

        t1.start();
        t2.start();
    }
}


//here the output will be printed one by one because synchronized block on both the run method requires the lock of class Class object of N1 class. And only can acquire the lock at a time and the other will go to blocked state till when the lock becomes free.
 
class ZRunnable implements Runnable {
    public void run() {
        synchronized(N1.class) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}

class YRunnable implements Runnable {
    public void run() {
        synchronized(N1.class) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++)
                System.out.println(i + " - " + t.getName());
        }
    }
}
