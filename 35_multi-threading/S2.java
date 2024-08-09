public class S2 {
    public static void main(String[] args) throws InterruptedException{
        
        YThread t = new YThread();
        t.start();
        t.join(1000);

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

    public void join()  throws InterruptedException {//compilation error because we cannot override the final join() method and its any version
    }

}

//error
// S2.java:22: error: join() in YThread cannot override join() in Thread
//     public void join()  throws InterruptedException {//compilation error because we cannot override the final join() method and its any version
//                 ^
//   overridden method is final
// 1 error
// error: compilation failed
