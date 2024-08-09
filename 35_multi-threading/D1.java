public class D1 {
    public static void main(String[] args) {

        MyThread mt = new MyThread();

        mt.start();

        MyThread main = Thread.currentThread();// compilation error because parent currentThread() will return object of
                                               // Thread class and we cannot store the reference code of the object of
                                               // parent class to the reference variable of the child class

        System.out.println(main);

    }
}

class MyThread extends Thread {

    public void run() {

        Thread t = Thread.currentThread();

        System.out.println(t);

    }

}

// D1.java:8: error: incompatible types: Thread cannot be converted to MyThread
//         MyThread main = Thread.currentThread();// compilation error because parent currentThread() will return object of
//                                             ^
// 1 error
// error: compilation failed