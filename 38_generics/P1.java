import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {

        ArrayList<? super Dog> arr = new ArrayList<Animal>();

        arr.add(new Dog());

        System.out.println(arr.get(0));//it contains a Dog object
        System.out.println(arr.get(0).hashCode());//printing hashcode of the object
        System.out.println(arr.get(0).hashCode());//so by default compiler is taking it as the object of Object class because object is internally actually stored in the variable of type Object class

        // System.out.println(arr.get(0).i);//compilation fail because compiler is searching for i in the Object class

        System.out.println(((Animal)arr.get(0)).i);//20
        System.out.println(((Dog)arr.get(0)).i);//30

    }
}

class Animal{
    int i = 20;
}
class Dog extends Animal{
    int i = 30;
}