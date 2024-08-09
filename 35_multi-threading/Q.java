public class Q {
    public static void main(String[] args){
        BThread a = new BThread();
        a.setName("A");
        a.start();
        
        BThread b = new BThread();
        b.setName("B");
        b.start();
        
        BThread c = new BThread();
        c.setName("C");
        c.start();

        Thread main = Thread.currentThread();
        
        for(int i=0; i<20; i++)
        System.out.println(main.getName());

    }
}

class BThread extends Thread{
    public void run(){
        Thread t = currentThread();
        if (t.getName() == "B"){
            try{
                t.sleep(1000);//this will sleep only the thread whoose name is B
            }catch(InterruptedException e){
                System.out.println("IE");
            }
        }

        for(int i=0; i<20; i++)
        System.out.println(i +" - "+t.getName());
    }
}