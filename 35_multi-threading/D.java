public class D {
    public static void main(String[] args) {
        
        MyThread mt = new MyThread();

        mt.start();

        Thread main = Thread.currentThread();

        System.out.println(main);
        
    }
}

class MyThread extends Thread {

    public void run() {

        Thread t = Thread.currentThread();

        System.out.println(t);

    }

}

//output
// Thread[main,5,main]
// Thread[Thread-0,5,main]


//the second output is this because when we create a custom thread object, then by default it is assigned the name as Thread-0
// Thread-0 --> first custom class thread object
// Thread-1 --> second custom class thread object
// and so on...

//mostly it gives the same output. But rarely its order changes.

// public void run(); is declared from the Runnable interface. 
// From the Runnable interface, it is inherited and overrridden in the child class Thread but in the Thread class run() method has no body so we must have to override the run() method.

//we are not directly creating the object of thread class because here run() method is blank and has no code inside it.
// So we create subclass of the class Thread to override the run() method in the subclass. 
// we are overriding the run() method because
// 1. run() method is the only method that is stacked/pushed first in the custom thread(thread/stack created by us).
// 2. all the code that we want to execute from the custom thread is written in the run() method only

//That's why it is recommended to create only one object of any custom-exception class because other object custom threads also execute the same run() method means executing the same tasks