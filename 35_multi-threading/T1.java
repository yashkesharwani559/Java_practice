public class T1 {
    public static void main(String[] args){
        System.out.println("hii");
        ZThread t = new ZThread();
        t.start();
        System.out.println("hii");
    }
}

class ZThread extends Thread{
    public void run(){
        Thread t = currentThread();
        // try{
        //     t.join();//creates an infinite wait or deadlock situation
        // }catch(InterruptedException e){
        //     e.printStackTrace();
        // }
    }
}