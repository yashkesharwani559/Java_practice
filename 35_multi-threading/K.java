class K {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        t.setPriority(1);//we can set the priority of the default main thread also
       
        System.out.println(t.getName() + " - " + t.getPriority());
    }    
}

//output
// main - 1