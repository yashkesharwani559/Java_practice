public class S {
    public static void main(String[] args){
        XThread t = new XThread();
        t.start();
    }
}


class XThread extends Thread{
    public void run(){
        Thread t = Thread.currentThread();

        System.out.println("hii");
        t.start();//IllegalThreadStateException an unchecked exception 

        System.out.println("jii");

    }
}

//output
// hii
// Exception in thread "Thread-0" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at XThread.run(S.java:14)