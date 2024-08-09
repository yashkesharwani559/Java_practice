public class T2 {
    public static void main(String[] args) throws InterruptedException{
        
        ZThread z = new ZThread();

        z.start();
        z.join();

        for(int i=0; i<10; i++)
        System.out.println(Thread.currentThread().getName());

    }
}

class ZThread extends Thread{
    public void run(){
        YThread y = new YThread();
        y.start();
        try{
            y.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0; i<10; i++)
        System.out.println(currentThread().getName());
    }
}

class YThread extends Thread{
    public void run(){
        XThread y = new XThread();
        y.start();
        try{
            y.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0; i<10; i++)
        System.out.println(currentThread().getName());
    }
}

class XThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(currentThread().getName());
    }
}
// order of printing in this program
// XThread
// YThread
// ZThread
// main

//output
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-2
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-1
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
// Thread-0
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