class M1 {
    static M1 c = new M1();

    public static void main(String[] args) {
        MThread t1 = new MThread();
        t1.setName("AAA");
        NThread t2 = new NThread();
        t2.setName("BBB");
        t1.start();
        t2.start();
    }

    synchronized static void pro() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(i + " - " + t.getName());
    }

    synchronized static void mno() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(i + " - " + t.getName());
    }
}

//here the output will be printed one by one because here both pro() and mno() are static synchronized. This means the thread requires to occupy the lock of the class Class object of class M1. But it can be allocated to only one at a time. And other one goes to the blocked state and comes back only when the lock becomes free

class MThread extends Thread {
    public void run() {
        M1.c.pro();
        //same as M1.pro()
    }
}

class NThread extends Thread {
    public void run() {
        M1.c.mno();
        //same as M1.mno()
    }
}

//output
// 0 - AAA
// 1 - AAA
// 2 - AAA
// 3 - AAA
// 4 - AAA
// 5 - AAA
// 6 - AAA
// 7 - AAA
// 8 - AAA
// 9 - AAA
// 10 - AAA
// 11 - AAA
// 12 - AAA
// 13 - AAA
// 14 - AAA
// 15 - AAA
// 16 - AAA
// 17 - AAA
// 18 - AAA
// 19 - AAA
// 0 - BBB
// 1 - BBB
// 2 - BBB
// 3 - BBB
// 4 - BBB
// 5 - BBB
// 6 - BBB
// 7 - BBB
// 8 - BBB
// 9 - BBB
// 10 - BBB
// 11 - BBB
// 12 - BBB
// 13 - BBB
// 14 - BBB
// 15 - BBB
// 16 - BBB
// 17 - BBB
// 18 - BBB
// 19 - BBB