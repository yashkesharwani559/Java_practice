class L2 {
    public static void main(String[] args) {
        
        MyRunnable r = new MyRunnable();

        // Thread t = new Thread(r);
        // t.setName("mohan");
        
        Thread t = new Thread(r, "mohan");//same as above
        //here the reference code of the r is copied in the target variable of the Thread class t object. and the name is stored in the name variable of the Thread class t object.
        
        t.start();

        Thread t1 = Thread.currentThread();

        System.out.println(t1.getName());
        
    }
}

class MyRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

//output
// main
// mohan