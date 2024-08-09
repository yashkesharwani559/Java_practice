public class D1 {
    public static void main(String[] args){
        Animal[] a = new Dog[2];

        a[0] = new BDog();
        a[1] = new Cat();
    }
}

//this will give runtime exception as
// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at D1.main(D1.java:6)

//this exception is on line 6 because we cannot assign first sibling class object to another sibling class variable in java
