import java.io.FileReader;
import java.io.FileNotFoundException;


public class F {
    F() {
        
        try{
            
            FileReader fr = new FileReader("abc.txt");
        
        } catch (FileNotFoundException e) {

            System.out.println(e);
            e.printStackTrace();
        
        }
    }
}

//no compilation error but cannot run because it doesn't contains main method