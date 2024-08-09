class G {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.setName("A");
        t1.start();

        BThread t2 = new BThread();
        t2.setName("B");
        t2.start();

        Thread x = Thread.currentThread();

        for (int i = 0; i < 10; i++)
            System.out.println(i + " - " + x.getName());
    }
}

class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for (int i = 0; i < 10; i++)
            System.out.println(i + " - " + x.getName());
    }
}

class BThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for (int i = 0; i < 10; i++)
            System.out.println(i + " - " + x.getName());
    }
}

//but the order of the output changes all the time
//output
// 0 - A
// 0 - main
// 0 - B
// 1 - main
// 1 - A
// 2 - main
// 1 - B
// 3 - main
// 2 - A
// 4 - main
// 2 - B
// 5 - main
// 3 - A
// 6 - main
// 3 - B
// 7 - main
// 4 - A
// 5 - A
// 8 - main
// 4 - B
// 9 - main
// 6 - A
// 5 - B
// 7 - A
// 6 - B
// 8 - A
// 7 - B
// 9 - A
// 8 - B
// 9 - B