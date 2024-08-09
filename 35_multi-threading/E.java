public class E {
    public static void main(String[] args) {

        MyThread mt = new MyThread();

        mt.run();

        Thread main = Thread.currentThread();

        System.out.println(main);

    }
}

//output
// Thread[main,5,main]
// Thread[main,5,main]

//here this code will be executed without any error (but run() method is called itself by the Java Runtime Environment(JRE)). This is because run() method will run in the same stack where the main() method runs that is the default main thread.

class MyThread extends Thread {

    public void run() {

        Thread t = Thread.currentThread();

        System.out.println(t);

    }
}