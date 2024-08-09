public class C {
    public static void main(String[] args){
        
        Thread t = Thread.currentThread();

        System.out.println("Thread's name: " + t.getName());//main
        
        System.out.println("Thread's ID: "+t.getId());//1
          
        System.out.println("Thread's priority: "+t.getPriority());//5

    }
}
//by default, there is the main thread provided by the java whoose 
// name = main
// id = 1
// priority = 5 (normal priority) (NORM_PRIORITY = 5)

//here the id of the main thread is fixed, means id is constantly 1, but we can change the name and priority of the main(default) thread