import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

class X3 {
    public static void main(String[] args) throws IOException {
        
        //Resource Declaration
        try (FileReader fr = new FileReader("abc2.txt");) {
            System.out.println(1);         
            
            System.out.println(fr.read());

            System.out.println(2);            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //here when try ends the fr resource is automatically closed
    }    
}

//output
// 1
// 100
// 2
