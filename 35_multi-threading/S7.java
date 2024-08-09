public class S7 {
    public static void main(String[] args) throws InterruptedException{
        
        YThread t = new YThread();
        Thread.sleep(200);//run witout any error 
        // but if we directly call sleep() method without calling start() method then the thread(whoose start() is not called) is not executed
     
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