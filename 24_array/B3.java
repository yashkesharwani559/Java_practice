public class B3 {
    public static void main(String[] args) {
        LivingBeing l = new LivingBeing();

        Animal[] a = { (Animal) l };

        System.out.println(a[0]);
        System.out.println(a);
    }
}

//this will not give any compilation error because compiler only checks the type of the variables but this will give the runtime exception as
// Exception in thread "main" java.lang.ClassCastException: class LivingBeing cannot be cast to class Animal (LivingBeing and Animal are in unnamed module of loader 'app')
//         at B3.main(B3.java:5)