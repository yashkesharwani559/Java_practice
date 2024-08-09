public class P {
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

        sleep();//compilation fail
        //because there is no sleep method in RunThread and Thread class that takes no argument

        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(t.getName());

    }
}

//error
// P.java:18: error: no suitable method found for sleep(no arguments)
//         sleep();//compilation fail
//         ^
//     method Thread.sleep(long) is not applicable
//       (actual and formal argument lists differ in length)
//     method Thread.sleep(long,int) is not applicable
//       (actual and formal argument lists differ in length)
// 1 error