public class Z {
    public static void main(String[] args){
        TThread t = new TThread();
        t.setName("AAA");
        t.start();
        Thread t1 = Thread.currentThread();

        for (int i = 0; i < 20; i++) {
            System.out.println(i + " - " + t1.getName());
            if (i >= 10) {
                System.out.println("Running the Runnable " + i);
                Thread.yield();
            }
        }
    }
}

class TThread extends Thread {
    public void run() {
        Thread t = currentThread();
        
        for (int i = 0; i < 20; i++)
        System.out.println(i + " - "+t.getName());
    }
}

//output
// 0 - main
// 1 - main
// 2 - main
// 0 - AAA
// 3 - main
// 4 - main
// 5 - main
// 6 - main
// 7 - main
// 8 - main
// 9 - main
// 10 - main
// 1 - AAA
// 2 - AAA
// 3 - AAA
// 4 - AAA
// 5 - AAA
// 6 - AAA
// 7 - AAA
// Running the Runnable 10
// 8 - AAA
// 11 - main
// Running the Runnable 11
// 9 - AAA
// 10 - AAA
// 11 - AAA
// 12 - AAA
// 13 - AAA
// 14 - AAA
// 15 - AAA
// 16 - AAA
// 17 - AAA
// 18 - AAA
// 12 - main
// 19 - AAA
// Running the Runnable 12
// 13 - main
// Running the Runnable 13
// 14 - main
// Running the Runnable 14
// 15 - main
// Running the Runnable 15
// 16 - main
// Running the Runnable 16
// 17 - main
// Running the Runnable 17
// 18 - main
// Running the Runnable 18
// 19 - main
// Running the Runnable 19