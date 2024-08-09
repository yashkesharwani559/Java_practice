import java.util.ArrayList;

//<? super class-name> -> using this syntax for typesafety means that we can assign a type of ArrayList which is same or parent/super class type but using this also we can actually store objects of the class-name class and also of their subclasses only

public class P {
    public static void main(String[] args) {

        //here super means we can assign ArrayList object of super or same in the arr

        //case 1:
        // ArrayList<? super Dog> arr = new ArrayList<>();

        // arr.add(new LivingBeing());
        // arr.add(new Animal());
        // arr.add(new Cat());
        // arr.add(new Car());
        // arr.add(new Dog());//correct
        // arr.add(new BDog());//correct

        // //case 2:
        // ArrayList<? super Dog> arr = new ArrayList<Object>();

        // arr.add(new LivingBeing());
        // arr.add(new Animal());
        // arr.add(new Cat());
        // arr.add(new Car());
        // arr.add(new Dog());//correct
        // arr.add(new BDog());//correct

        //case 3:
        // ArrayList<? super Dog> arr = new ArrayList<LivingBeing>();

        // arr.add(new LivingBeing());
        // arr.add(new Animal());
        // arr.add(new Cat());
        // arr.add(new Car());
        // arr.add(new Dog());//correct
        // arr.add(new BDog());//correct

        //case 4:
        // ArrayList<? super Dog> arr = new ArrayList<Animal>();

        // arr.add(new LivingBeing());
        // arr.add(new Animal());
        // arr.add(new Cat());
        // arr.add(new Car());
        // arr.add(new Dog());//correct
        // arr.add(new BDog());//correct

        //case 4:
        // ArrayList<? super Dog> arr = new ArrayList<Dog>();

        // arr.add(new LivingBeing());
        // arr.add(new Animal());
        // arr.add(new Cat());
        // arr.add(new Car());
        // arr.add(new Dog());//correct
        // arr.add(new BDog());//correct

        //case 5:
        // ArrayList<? super Dog> arr = new ArrayList<Cat>();//compilaion fail
        
        //case 5:
        // ArrayList<? super Dog> arr = new ArrayList<BDog>();
        
    }
}

class LivingBeing{}
class Animal extends LivingBeing{}
class Dog extends Animal{}
class Cat extends Animal{}
class BDog extends Dog{}
class Car{}