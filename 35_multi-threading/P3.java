public class P3 {
    public static void main(String[] args) {

        RunThread ot = new RunThread();
        ot.start();

        Thread t = Thread.currentThread();

        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

class RunThread extends Thread {
    public void run() {
        try {
            // Thread.sleep(1000);
            // RunThread.sleep(1000);
            sleep(1000);//static method that's why correct
            // all above are correct
            
        }catch(InterruptedException e){
            System.out.println(e);
        }//run without any error
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}