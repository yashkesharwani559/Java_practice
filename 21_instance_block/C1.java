public class C1 {
    static{
        System.out.println("A");
    }
}

//this will give no compilation error but will give runtime error as main method not found so it is required for a class to have a main method if he wants to run its static initialization block

// this will give error as 

// Error: Main method not found in class C1, please define the main method as:
//    public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application
