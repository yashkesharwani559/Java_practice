public class I {
    public static void main(String[] args) {

       Animal a = new Animal();
       Cat c = new Cat();
       Cow cow = new Cow();
       Dog d = new Dog();
       BDog b = new BDog();

       pro(a, c, cow, d, b);//correct
    //    because it is allowed that parent class variable can store the child class object

    }

    static void pro(Animal... x){
        System.out.println("hello");
    }
}
class LivingBeing{

}
class Animal extends LivingBeing{}
class Cat extends Animal{}
class Cow extends Animal{}
class Dog extends Animal{}
class BDog extends Dog{}