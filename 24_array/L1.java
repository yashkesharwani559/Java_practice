public class L1 {
    public static void main(String[] args){
        Animal[] a = new Animal[3];

        //case 1
        // a[0] = (Dog) new Animal();
        
        //case 2
        a[0] = (Dog) new Cat();
    }
}


// case 1
//this will give runtime exception as
// Exception in thread "main" java.lang.ClassCastException: class Animal cannot be cast to class Dog (Animal and Dog are in unnamed module of loader 'app')
//         at L1.main(L1.java:5)

// case 2
//this will give compilation error as
// L1.java:9: error: incompatible types: Cat cannot be converted to Dog
//         a[0] = (Dog) new Cat();
//                      ^
// 1 error