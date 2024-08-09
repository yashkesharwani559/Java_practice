public class R2 {
    public static void main(String[] args) {
        RThread rt = new RThread();
        rt.setName("RT");
        rt.start();
        try{
            rt.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Thread main = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(main.getName());

    }
}
class RThread extends Thread {
    public void run() {
        Thread t = currentThread();

        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

// output
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
// RT
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