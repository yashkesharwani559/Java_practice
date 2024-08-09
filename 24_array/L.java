public class L {
    public static void main(String[] args){
        Animal[] x = new Dog[3];
        x[0] = new Dog();
        // case 1
        // x[1] = new Animal();

        // case 2
        x[2] = new Cat();
    }
}

//this will give runtime exception as

// case 1
// Exception in thread "main" java.lang.ArrayStoreException: Animal
//         at L.main(L.java:6)

// case 2
// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at L.main(L.java:9)