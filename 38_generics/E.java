import java.util.ArrayList;

public class E {
    public static void main(String[] args) {

        ArrayList<Animal> arr = new ArrayList<Cat>();//compilation fail
        //this is not allowed because if it is allowed then someone will try to store object of other subclass of the class Animal and then it will give ArrayStoreException.
        // Means at last we can say that this above is not allowed is to prevent the code from upcoming ArrayStoreException 

        
        ArrayList<Cat> arr = new ArrayList<Animal>();//compilation fail
        //this is not allowed because child class cannot store the object of the parent class.

    }
}

class Animal {
    
}

class Cat extends Animal {
    
}