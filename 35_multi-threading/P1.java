public class P1 {
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

        sleep(1000);//compilation fail
        //because sleep(long) method throws InterrruptedException which is a checked exception so we must have to handle or declare it in the method signature.

        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

//error
// P1.java:18: error: unreported exception InterruptedException; must be caught or declared to be thrown
//         sleep(1000);//compilation fail
//              ^
// 1 error
// error: compilation failed