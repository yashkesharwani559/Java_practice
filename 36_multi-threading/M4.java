class M4 {
    static M4 c = new M4();

    public static void main(String[] args) {
        MThread t1 = new MThread();
        t1.setName("AAA");
        NThread t2 = new NThread();
        t2.setName("BBB");
        t1.start();
        t2.start();
    }

    static void pro() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(i + " - " + t.getName());
    }

    synchronized static void mno() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 50; i++)
            System.out.println(i + " - " + t.getName());
    }
}


//mix output because one is synchronized whereas other is not

class MThread extends Thread {
    public void run() {
        M4.c.pro();
    }
}

class NThread extends Thread {
    public void run() {
        M4.c.mno();
    }
}
