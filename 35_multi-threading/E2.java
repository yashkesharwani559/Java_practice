public class E2 {
    public static void main(String[] args) {

        MyThread mt = new MyThread();

        mt.run();
        mt.start();

        Thread main = Thread.currentThread();

        System.out.println(main);

    }
}

//output
// Thread[main,5,main]
// Thread[main,5,main]
// Thread[Thread-0,5,main]



class MyThread extends Thread {

    public void run() {

        Thread t = Thread.currentThread();

        System.out.println(t);

    }
}