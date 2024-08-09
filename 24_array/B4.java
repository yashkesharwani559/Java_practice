public class B4 {
    public static void main(String[] args) {
        LivingBeing l = new Cat();

        Dog[] a = { (Dog) l };

        System.out.println(a[0]);
        System.out.println(a);
    }
}

//this will give runtime exception as
// Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
//         at B4.main(B4.java:5)

