public class S8 {
    public static void main(String[] args) throws InterruptedException {
        
        Thread.sleep(20000);//this will sleep the main thread for 20000milliseconds = 20 seconds and after it the main thread and main method runs
     
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

    public static void sleep(long millis) throws InterruptedException {
        System.out.println(currentThread().getName());
        currentThread().join(millis);
        System.out.println(currentThread().getName());
    }

}