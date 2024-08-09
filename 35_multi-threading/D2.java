public class D2 {
    public static void main(String[] args) {

        MyThread mt = new MyThread();

        mt.start();

        MyThread main = (MyThread) Thread.currentThread();//gives ClassCastException because parent class object cannot be typecasted to the child class object
        
        System.out.println(main);

    }
}

class MyThread extends Thread {

    public void run() {

        Thread t = Thread.currentThread();

        System.out.println(t);

    }

}

//exception
// Thread[Thread-0,5,main]Exception in thread "main"
// java.lang.ClassCastException: class java.lang.Thread cannot be cast to class MyThread (java.lang.Thread is in module java.base of loader 'bootstrap'; MyThread is in unnamed module of loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @4ac3c60d)
//         at D2.main(D2.java:8)