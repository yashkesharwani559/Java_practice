public class B {
    public static void main(String[] args){
        Thread t = Thread.currentThread();


        System.out.println(t);//Thread[main, 5, main]

    }
}

//here if we directly print the object of the Thread class then in the Thread class toString() method is successfully overridden so that it prints Thread[name, priority, group] --> where the first one is the name of the thread, second one is the priority of the thread, and the third/last one is the group name 