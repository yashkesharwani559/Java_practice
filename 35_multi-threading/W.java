public class W {
    public static void main(String[] args)  {
        NThread n = new NThread();
        n.setName("AAA");
        n.start();

         Thread t = Thread.currentThread();
        for(int i=0; i<20; i++){
            System.out.println(t.getName());
        }
        
    }
}

class NThread extends Thread{
    public void run() {
        Thread t = currentThread();
        for(int i=0; i<20; i++){
            yield();
            System.out.println(t.getName());
        }
    }
}

//output
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
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA
// AAA

