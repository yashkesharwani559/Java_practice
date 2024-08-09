//creating a thread by creating the subclass of the Thread class

class L1 {
    public static void main(String[] args) {
        
        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);
        t.setName("mohan");
        t.start();

        Thread t1 = Thread.currentThread();

        System.out.println(t1.getName());
        
    }
}
//it is a best and recommended way to create a thread in java.

//We can create the new Thread by following the below steps:-

// 1. By creating subclass of the Runnable interface (created MyRunnable class).

// 2. Since Runnable is an interface, that's why it is must to implement/define the public void abstract run(); method in the subclass.So we are overriding the run() method in the subclass.

// 3. writing the code inside the run() method that is to be executed in the new custom thread/call-stack.

// 4. creating the object of the MyRunnable class in the main method

// 5. create the object of the Thread class calling the Thread(Runnable target) type constructor and pass the MyRunnable class object to it.

// 6. Now call t.start() and this will create a new custom thread/call-stack.

// Thread class contains a private Runnable variable called as target that is by default null. 
// But using the above two constructor we can set the value of target and there is no any method in the Thread class by using which we can get or set the value in the target. So we can set the value of target only at the time of constructor call of these above two.



class MyRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

//output
