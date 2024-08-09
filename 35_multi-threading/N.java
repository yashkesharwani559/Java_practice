public class N {
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().isAlive());//true
        //the calling of this isAlive() function from any method will give true as returned value.

        //I think its a silly question to ask from a thread in which that method is running that that thread is alive or not . So it will always gives true on this statement
    }

    // Runnable state ----------> Running state 
    // and
    // Running state ------------> Runnable state is the only case where the directly interchanging of threads in possible in the lifecycle of thread 
}
