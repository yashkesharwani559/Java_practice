public class N1 {
    public static void main(String[] args) {
        AThread t = new AThread();

        System.out.println(Thread.currentThread().getName());//main
        System.out.println(AThread.currentThread().getName());//main
        System.out.println(t.currentThread().getName());//main
        //and here it is because it is called in the main method which is running in the main thread
    }
}
//this is because currentThread() is an static method and no matters from which context it is called, it always gives the object's reference code of the thread from where it is called.

class AThread extends Thread{
    public void run(){
        System.out.println("AThread");
    }
}