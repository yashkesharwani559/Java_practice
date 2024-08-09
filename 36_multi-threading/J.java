public class J {
    public static void main(String[] args) {
        JThread t = new JThread();
        t.setName("JJ");

        JThread t1 = new JThread();
        t1.setName("JJKK");

        t1.start();
        t.start();
    }
    synchronized static void pro(){
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++) {
            System.out.println(t.getName());
        }
    }
}

class JThread extends Thread {

    public void run() {
        J.pro();
    }
}

// here only one will print at a time because here the static method pro() is synchronized so only one thread can run the pro() method

//output
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJKK
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ
// JJ