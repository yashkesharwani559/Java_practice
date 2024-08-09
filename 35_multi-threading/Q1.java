public class Q1 {
    public static void main(String[] args) {
        AThread t = new AThread();
        t.setName("A");
        t.start();

        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 50; i++)
            System.out.println(t1.getName());

        if(!(t.isAlive())){
            t.start();//here the t doesnot have real thread/call-stack/thread of execution but we cannot call start method again. This will give the IllegalThreadStateException.
        }

    }
}
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at Q1.main(Q1.java:12)

class AThread extends Thread {
    public void run() {
        Thread t = currentThread();
        System.out.println(t.getName());
   }
}