import java.io.File;
import java.io.IOException;

public class G {
    public static void main(String[] args) {
        
        File file = new File("abc2.txt");

        System.out.println(file.exists());//false

        try{
            System.out.println(file.createNewFile());//true
        } catch (IOException e) {
            System.out.println("File is already there");
        }
        
        System.out.println(file.exists());//true


        //here we see that how to create a new file

        // public boolean createNewFile() -->It is a non-static (instance) method. It creates a new empty file with same pathname only when the file doesn't exist yet and returns true and otherwise if file exists then it returns false
        //it throws two exceptions OException and SecurityException .
        // IOException is a checked exception whereas SecurityException is an unchecked exception. 
        // so due to IOException we must use it inside the try catch block. 
        // IOException is generated when an I/ error occured.
        // and SecurityException is generated due to security reasons
        
    }
}
//output
// false
// true
// true