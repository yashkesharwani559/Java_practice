class N3 {
    static N3 j = new N3();
    // static Class c = j.getClass();
    static Class c = N3.class;//same as above
    
    public static void main(String[] args) {
        XYZThread t1 = new XYZThread();
        PQRThread t2 = new PQRThread();
        t1.setName("Dholu");
        t2.setName("Bholu");
        t1.start();
        t2.start();
    }
    
    synchronized static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<20;i++) 
            System.out.println(i + " - " + t.getName());
    }
}
//here the output will be printed one by one because the pro() is a static synchronized method means it requires the lock of class Class object(N3) and the synchronized block also requires the same lock. So only one will run at a time and other will go to the blocked state and will come back to Runnable state only when the lock becomes free
class XYZThread extends Thread {
    public void run() {
        N3.j.pro();    
    }
}

class PQRThread extends Thread {
    public void run() {
        synchronized(N3.c) {
            Thread t = Thread.currentThread();

            for(int i=0;i<20;i++) 
                System.out.println(i + " - " + t.getName());
        }
    }
}