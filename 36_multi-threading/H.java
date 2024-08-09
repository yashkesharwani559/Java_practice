public class H extends Thread {
    public static void main(String[] args) {

        Thread t = currentThread();
        System.out.println(t.getName());
        H a = new H();
        a.setName("aa");
        a.start();
        System.out.println(a.getName());
        System.out.println(t.getName());
    }

    public void run() {
        Thread t = currentThread();
        System.out.println(t.getName());
    }
}

//this means the main() method always runs in the main thread(default thread)

//output
// main
// aa 
// main
// aa

