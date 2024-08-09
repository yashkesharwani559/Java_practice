public class S6 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = Thread.currentThread();
        t.start();//IllegalThreadStateException

        for(int i=0; i<20; i++)
        System.out.println("main");

    }
}

// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at S6.main(S6.java:4)
 
 
class YThread extends Thread{
     
    public void run(){
        Thread t = currentThread();
        for(int i=0; i<20; i++)
        System.out.println(t.getName());
    }

    public static void sleep(long millis) throws InterruptedException {
        System.out.println(currentThread().getName());
        currentThread().join(millis);
        System.out.println(currentThread().getName());
    }

}
