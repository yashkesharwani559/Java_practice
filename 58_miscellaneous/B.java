import java.io.Console;


public class B {
    public static void main(String[] args) {
        Console con = System.console();
        String s = con.readLine();
        System.out.println(s);
        System.out.println(s + 2);
        System.out.println(Integer.parseInt(s) + 2);
    }
}

//this will ive output as
// 23
// 23
// 232
// 25


// facts about Console class 
// 1. Console is a final class that doesnot have any public constructor so we have to do something different to create the object of class Console

// So here we use System class that contains a static method console() that is used to create the Console class object

// now Console class has an instance method readLine() that is used to take input from users and return them as a string


// Integer is a class in the package java.lang 
// It has a static method called parseInt(String)  that takes String as argument and convert it into the int