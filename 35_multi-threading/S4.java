public class S4 {
    public static void main(String[] args) throws InterruptedException{
        
        YThread t = new YThread();
        t.start();
        t.sleep(1000);
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

//output
// main
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
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main