public class H {
    public static void main(String[] args){
        MyThread1 mt = new MyThread1();

        mt.start();
        mt.start();//IllegalThreadStateException 
        //because when we call the start() method more than once for the same object then it generates IllegalThreadStateException
    }
}

class MyThread1 extends Thread {

}


//exception
// Exception in thread "main" java.lang.IllegalThreadStateEx
   at java.base/ja
va.lang.Thread.start(Thread.java:794)
//         at H.main(H.java:6)