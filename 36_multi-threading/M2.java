class M2 {
    static M2 c = new M2();

    public static void main(String[] args) {
        M1Thread t1 = new M1Thread();
        t1.setName("AAA");
        N1Thread t2 = new N1Thread();
        t2.setName("BBB");
        t1.start();
        t2.start();
    }

    synchronized static void pro() {
        Thread t = Thread.currentThread();
        for  (int  i  =   0 ; i  < 20; i++)
            System.out.println(i + " - " + t.getName());
    }

    synchronized void mno() {
        Thread t = Thread.currentThread();
        for  (int  i  =   0 ; i  < 20; i++)
            System.out.println(i + " - " + t.getName());
    }
}

//here the output will be printed in mix because we know that here both pro() and mno() are synchronized. But pro() is static while mno() is an instance method. So to run pro() method the thread have two the class Class object for M2's lock and for mno() method the thread have to take the lock of object of M2 class.
// And since both the locks are different. So they both run concurrently and prints mix output.


class M1Thread extends Thread {
    public void run() {
        M2.c.pro();
    }
}

class N1Thread extends Thread {
    public void run() {
        M2.c.mno();
    }
}

//output
// 0 - BBB
// 0 - AAA
// 1 - BBB
// 1 - AAA
// 2 - BBB
// 2 - AAA
// 3 - BBB
// 3 - AAA
// 4 - BBB
// 4 - AAA
// 5 - BBB
// 5 - AAA
// 6 - BBB
// 6 - AAA
// 7 - BBB
// 7 - AAA
// 8 - BBB
// 8 - AAA
// 9 - BBB
// 9 - AAA
// 10 - BBB
// 10 - AAA
// 11 - BBB
// 11 - AAA
// 12 - BBB
// 12 - AAA
// 13 - BBB
// 13 - AAA
// 14 - BBB
// 15 - BBB
// 16 - BBB
// 17 - BBB
// 14 - AAA
// 15 - AAA
// 18 - BBB
// 19 - BBB
// 16 - AAA
// 17 - AAA
// 18 - AAA
// 19 - AAA