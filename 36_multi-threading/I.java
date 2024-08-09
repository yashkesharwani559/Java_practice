public class I extends Thread {
    static int i = 0;
    public static void main(String[] args) {
        Thread t = currentThread();
        System.out.println(t.getName());
        I i = new I();
        String s = "I" + i;
        i.setName(s);
        i.start();
    }
    
    public void run() {
        Thread t = currentThread();
        if (i >= 10){
            return;
        }
        i++;
        System.out.println(t.getName());
        String[] s = {"hii"};
        main(s);
    }

}

//output
// main
// IThread[Thread-0,5,main]
// IThread[Thread-0,5,main]
// IThread[Thread-1,5,main]
// IThread[Thread-1,5,main]
// IThread[Thread-2,5,main]
// IThread[Thread-2,5,main]
// IThread[Thread-3,5,main]
// IThread[Thread-3,5,main]
// IThread[Thread-4,5,main]
// IThread[Thread-4,5,main]
// IThread[Thread-5,5,main]
// IThread[Thread-5,5,main]
// IThread[Thread-6,5,main]
// IThread[Thread-6,5,main]
// IThread[Thread-7,5,main]
// IThread[Thread-7,5,main]
// IThread[Thread-8,5,main]
// IThread[Thread-8,5,main]
// IThread[Thread-9,5,main]
// IThread[Thread-9,5,main]