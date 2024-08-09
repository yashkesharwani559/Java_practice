// Here we are knowing all about the singleton class.
// so basically, Singleton class is a class whose we can create only one object and after that it will return the same object 

// like here is the example of Console class
// Console class is a concrete class in java.io package. This class object is created by the java itself when the java loads and after that no other object can be created with that class.
//  and 
// console() -> is a static method in System class that returns the Console object that is already created internally by java.
// System class is in java.lang package, so we don't need to import it.

import java.io.Console;

class A {
    public static void main(String[] args) {
        
        Console c1 = System.console();
        Console c2 = System.console();
        Console c3 = System.console();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1 = c2);// correct
        System.out.println(c1 = c3);// correct
        // all above will print same output because Console is a singleton class

        System.out.println(c1 == c2);// true
        System.out.println(c1 == c3);// true

    }
}