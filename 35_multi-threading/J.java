class J {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.setPriority(t.MAX_PRIORITY);
        t.setPriority(MyThread.MAX_PRIORITY);
        t.setPriority(Thread.MAX_PRIORITY);// all three are correct
        // MAX_PRIORITY is a public static final int variable that has a fixed value of
        // 10

        System.out.println(t.getPriority());// 10
    }
}

class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x);
    }
}
