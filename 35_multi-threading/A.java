class A {
    public static void main(String[] args) {

        Thread main = Thread.currentThread();

        // main.setPriority(0);//IllegalArgumentException because argument is not in range 1 - 10

        System.out.println(main.getPriority());

    }
}

//when we call the start() method more than one time using same object (Thread class object) means if we call start() method second time from the same object then it will generate the IllegalThreadStateException because the thread is already started

//t.setPriority(11) --> IllegalArgumentException(unchecked exception) because setPriority() method throws IllegalArgumentException when we pass argument which is not in the range 1 - 10

//all three versions of join(), all three versions of wait(), all two versions of sleep() method throws the InterruptedException (checked exception)

// wait() method and its all three versions are defined in the Object class only and not in the Thread class. But using inheritance, Thread class contains main method in it

// Thread class contains an instance variable "name" which contains the name of the particular thread object