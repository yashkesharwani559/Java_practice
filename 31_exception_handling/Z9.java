import java.io.IOException;
import java.io.FileReader;

class Z9 {
    public static void main(String[] args) throws IOException {
        
        //Resource Declaration
        try (FileReader e = new FileReader("abc2.txt");FileReader fr = new FileReader("abc2.txt")) {
            System.out.println(1);         
            
            // System.out.println(fr.read());

            System.out.println(2);            
        }       
    }    
}
