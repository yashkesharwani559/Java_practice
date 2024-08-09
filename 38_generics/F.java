public class F {
    public static void main(String[] args) {
        
        Animal[] a = new Dog[2];

        a[1] = new Cat();//it is allowed because a is an array of the Animal class which is a parent of the Cat class. But this will give ArrayStoreException because a array has internally has a variable of Dog class and Dog variable cannot store the object of the Cat class

        //from preventing this exception, java doesnot allow this same in the generics 

    }
}

class Animal{

}

class Cat extends Animal{

}

class Dog extends Animal{

}