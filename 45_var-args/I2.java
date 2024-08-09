public class I2 {
    public static void main(String[] args) {

        LivingBeing lb1 = new LivingBeing();
        LivingBeing lb2 = new BDog();

        pro((Animal) lb1, (Animal) lb2);//this will give ClassCatException because lb1 has object ofLivingBeing class and parent object can't be assigned to a child class variable

    }

    static void pro(Animal... x) {
        System.out.println("hello");
    }
}

// Exception in thread "main" java.lang.ClassCastException: class LivingBeing cannot be cast to class Animal (LivingBeing and Animal are in unnamed module of loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @3a93b025)
//         at I2.main(I2.java:7)
class LivingBeing{

}
class Animal extends LivingBeing{}
class Cat extends Animal{}
class Cow extends Animal{}
class Dog extends Animal{}
class BDog extends Dog{}
