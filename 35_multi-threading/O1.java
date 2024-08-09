public class O1 {
    public static void main(String[] args){
        OurThread ot = new OurThread();
        ot.start();
        ot.sleep(1000);//compilation fail 
        // because sleep(long millis) throws the InterruptedException which is a checked exception so we must have to handle or throw it from our method
        
    }
}

class OurThread extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        for(int i=0; i<20;i++)
        System.out.println(t.getName());
    }
}

//error
// O1.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
//         ot.sleep(1000);//compilation fail
//                 ^
// 1 error
// error: compilation failed