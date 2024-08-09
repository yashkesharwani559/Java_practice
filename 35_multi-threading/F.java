class F {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        
        t.setName("mohan");//sets the name to mohan 
        t.start();
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + x.getName());
    }    
}

class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(i + x.getName());
    }
}

//here the order of the output changes everytime you run it. Means everytime the order you get when you run it is different
//output
// 0main
// 1main
// 2main
// 3main
// 4main
// 5main
// 6main
// 7main
// 8main
// 9main
// 10main
// 11main
// 12main
// 13main
// 14main
// 15main
// 16main
// 0mohan
// 17main
// 1mohan
// 18main
// 2mohan
// 19main
// 3mohan
// 4mohan
// 5mohan
// 6mohan
// 7mohan
// 8mohan
// 9mohan
// 10mohan
// 11mohan
// 12mohan
// 13mohan
// 14mohan
// 15mohan
// 16mohan
// 17mohan
// 18mohan
// 19mohan