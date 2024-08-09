public class O {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("hello from the new thread");
        });
        thread.start();

        System.out.println("hii");
    }
}
//This is allowed because Thread class has a Runnable parameterized constructor and we already know that Runnable is a functional interface, So lambda expression is used to override the method run of the Runnable interface.

//output
// hii
// hello from the new thread
