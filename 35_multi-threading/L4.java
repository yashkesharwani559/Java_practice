public class L4 {
    public static void main(String[] args) {
        
        Thread thread = new Thread(() ->
        {
            Thread t = Thread.currentThread();
            for (int i = 1; i < 50;i++)
            System.out.println(i+" - "+t.getName());
        });//here we are using lambda expression to create the thread without creating a child class of class Thread.
        // it is also correct
        
        thread.start();
        
        Thread t = Thread.currentThread();
        for (int i = 1; i < 50;i++)
        System.out.println(i+" - "+t.getName());
        
    }
}
