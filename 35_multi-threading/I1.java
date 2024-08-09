class I1 {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.setName("A");
        t1.setPriority(8);

        BThread t2 = new BThread();
        t2.setName("B");
        t2.setPriority(2);

        Thread x = Thread.currentThread();
        t1.start();
        t2.start();
        
        System.out.println("THread name: " + x.getName());
        System.out.println("THread id: " + x.getId());
        System.out.println("THread priority: " + x.getPriority());
        
    }    
}


class AThread extends Thread {
    public void run() {
        Thread t1 = Thread.currentThread();
        System.out.println("THread name: " + t1.getName());
        System.out.println("THread id: " + t1.getId());
        System.out.println("THread priority: " + t1.getPriority());
    }
}

class BThread extends Thread {
    public void run() {

        Thread t1 = Thread.currentThread();
        System.out.println("THread name: " + t1.getName());
        System.out.println("THread id: " + t1.getId());
        System.out.println("THread priority: " + t1.getPriority());

    }
}

//output changes all the time
//output
// THread name: A
// THread name: B
// THread name: main
// THread id: 12
// THread id: 1
// THread priority: 8
// THread priority: 5
// THread id: 13
// THread priority: 2
