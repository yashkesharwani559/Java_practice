public class M1 {
    public static void main(String[] args) {
        // AThread t = new AThread();
        // Thread thread = new Thread(t,"mohan");
        // thread.start();

        // this above is same as
        new Thread(new AThread(),"mohan").start();

        System.out.println(Thread.currentThread().getName());

    }
}

//these both M and M1 are correct but recommended only when we doesnot require that object again 

class AThread implements Runnable{

    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}

//output
// main 
// mohan
