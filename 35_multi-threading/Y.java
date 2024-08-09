public class Y {
    public static void main(String[] args){  
        
        TThread t1 = new TThread();
        t1.setName("AAA");
        t1.setPriority(10);
        t1.start();
        
        Thread t = Thread.currentThread();
        t.setPriority(1);

        for (int i = 0; i < 50; i++) {
            System.out.println(t.getName());
        }

    }
}

class TThread extends Thread{
    public void run(){
        Thread t = currentThread();

        for(int i=0; i<50; i++){
            System.out.println(t.getName());
        }
    }
}

//sometimes main or AAA comes first but both will print one at a time 
// because setPriority() and yield() don't function well in windows.