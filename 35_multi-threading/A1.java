class A {
    public static void main(String[] args) {

        Thread main = Thread.currentThread();

        // main.setPriority(0);//IllegalArgumentException because argument is not in range 1 - 10

        System.out.println(main.getPriority());

    }
}

//public final void setPriority(int newPriority) -->  changes the priority of the thread object from which it is called.
//it returns void means nothing
