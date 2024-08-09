class L2 {
    public static void main(String[] args){
        Animal[] a = new Dog[3];
        Animal b = new Cat();
        
        a[0] = b;
    }
}

//this will give runtime exception as
// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at L2.main(L2.java:6)