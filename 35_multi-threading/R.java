public class R {
    public static void main(String[] args) {
        RThread rt = new RThread();
        rt.setName("RT");
        rt.start();
        rt.join();//compilation error 
        // because join() method throws an InterruptedException that is a checked exception so it must be declared or handled

        Thread main = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(main.getName());

    }
}

//compilation error
// R.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
//         rt.join();//compilation error
//                ^
// 1 error
// error: compilation failed

class RThread extends Thread{
    public void run(){
        Thread t = currentThread();

        for(int i=0; i<20; i++)
        System.out.println(t.getName());

    }
}
