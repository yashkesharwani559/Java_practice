class L3 {
    public static void main(String[] args) {
        
        MyRunnable r = new MyRunnable();

        MyThread t = new MyThread(r);

        t.start();

        Thread t1 = Thread.currentThread();

        System.out.println(t1.getName());
        
    }
}

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("hello");
    }
}

class MyThread extends Thread {
    
    public void run() {
        System.out.println("hii");
    }

    public MyThread(){
        super();
    }

    public MyThread(Runnable target) {
        super(target);
        System.out.println("Pro");
    }
    
}
//output
// Pro
// main
// hii