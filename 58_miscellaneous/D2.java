import java.io.Console;
 
public class D2 {
    public static void main(String[] args){
        Console c1 = System.console();
        Console c2 = System.console();
        Console c3 = System.console();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

//this will give output as
// java.io.Console@3d51f06e
// java.io.Console@3d51f06e
// java.io.Console@3d51f06e

//this is because everytime when we call the console() method then it doesnot creates the object of the Console class but it gives the same object that is already created before(in association with the JVM)
//
// console() method will returns null only when java program/application is not in the terminal/console