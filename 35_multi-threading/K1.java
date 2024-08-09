class K1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        t.setPriority(-1);//IllegalArgumentException 
        // because the argument allowed in the setPriority() method is in the range from 1 - 10 and except these all other values when passed to the setPriority(int) method gives IllegalArgumentException
       
        System.out.println(t.getName() + " - " + t.getPriority());
    }    
}

//exception 
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1141)
//         at K1.main(K1.java:5)