class I {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.setName("A");
        t1.setPriority(7);

        BThread t2 = new BThread();
        t2.setName("B");
        t2.setPriority(3);

        Thread x = Thread.currentThread();
        
        System.out.println("THread name: " + x.getName());
        System.out.println("THread id: " + x.getId());
        System.out.println("THread priority: " + x.getPriority());
        
        System.out.println("THread name: " + t1.getName());
        System.out.println("THread id: " + t1.getId());
        System.out.println("THread priority: " + t1.getPriority());
        
        System.out.println("THread name: " + t2.getName());
        System.out.println("THread id: " + t2.getId());
        System.out.println("THread priority: " + t2.getPriority());
    }    
}


class AThread extends Thread {
    public void run() {

    }
}

class BThread extends Thread {
    public void run() {

    }
}

//same output all the time
//output
// THread name: main
// THread id: 1
// THread priority: 5
// THread name: A
// THread id: 12
// THread priority: 7
// THread name: B
// THread id: 13
// THread priority: 3