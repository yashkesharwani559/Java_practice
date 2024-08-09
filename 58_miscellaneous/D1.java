import java.io.Console;
 
public class D1 {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.println(con);
    }
}
//this will give no error because System.console() is the only method that returns the object of the Console class
// but the Console class object is already created with the association of the JVM and then the same object is returned when you call the console() method

//this will give output as
// java.io.Console@4facf68f