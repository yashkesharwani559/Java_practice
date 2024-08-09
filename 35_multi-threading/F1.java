class F1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println(t.getName());//Thread-0
        t.setName("mohan");//sets the name to mohan 
        System.out.println(t.getName());//mohan
        Thread x = Thread.currentThread();
    }
}
//output
// Thread-0
// mohan

//means that when the object is created then by default the name stored in the MyThread object is assigned the "Thread-0" but when we used the setPriority("mohan") then the name is changed to mohan

//    private volatile String name; --> name is a String type private volatile variable in java. Since name is private, it cannot be accessed outside, That's why setName(String) method is there

class MyThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
    }
}

