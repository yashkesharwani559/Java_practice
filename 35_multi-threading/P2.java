public class P2 {
    public static void main(String[] args) {

        RunThread ot = new RunThread();
        ot.start();

        Thread t = Thread.currentThread();

        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

class RunThread extends Thread {
    public void run() throws InterrruptedException {//compilation fail 
        // because we cannot declare a new checked exception in the overriding method. That's why here from the run() method we cannot throw any checked exception

        sleep(1000);
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

//error
// P2.java:16: error: cannot find symbol
//     public void run() throws InterrruptedException {//compilation fail
//                              ^
//   symbol:   class InterrruptedException
//   location: class RunThread
// P2.java:16: error: run() in RunThread cannot implement run() in Runnable
//     public void run() throws InterrruptedException {//compilation fail
//                 ^
//   overridden method does not throw InterrruptedException
// 2 errors
// error: compilation failed