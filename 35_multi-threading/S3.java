public class S3 {
    public static void main(String[] args) throws InterruptedException{
        
        YThread t = new YThread();
        t.start();
        t.sleep(1000);
        t.start();//gives IllegalThreadStateException

        for(int i=0; i<20; i++)
        System.out.println("main");

    }
}

class YThread extends Thread{
     
    public void run(){
        Thread t = currentThread();
        for(int i=0; i<20; i++)
        System.out.println(t.getName());
    }

    public static void sleep(long millis)  throws InterruptedException {//overriding the sleep method but sleep() method is going to sleep in the main thread

        System.out.println(currentThread().getName() + " is going to sleep.");

        // sleep(millis);//calls same method
        // //method recursion
        // //and at last it will give StackverFlowError

        Thread.sleep(millis);
        
    }

}

//output
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// main is going to sleep.
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at S3.main(S3.java:7)