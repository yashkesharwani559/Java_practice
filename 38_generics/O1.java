import java.util.ArrayList;
 
public class O1 {
    public static void main(String[] args) {

        ArrayList<Animal> arr = new ArrayList<>();

        // arr.add(new LivingBeing());//compilation fail
        arr.add(new Animal());//correct
        arr.add(new Dog());//correct
        arr.add(new Cat());//correct
        arr.add(new BDog());//correct

    }
}

class LivingBeing{}
class Animal extends LivingBeing{}
class Dog extends Animal{}
class Cat extends Animal{}
class BDog extends Dog{}