import java.io.IOException;
import java.io.FileReader;

class Z8 {
    public static void main(String[] args) throws IOException {
        
        //Resource Declaration
        try (IOException e = new IOException()) {
            System.out.println(1);         
            
            // System.out.println(fr.read());

            System.out.println(2);            
        }       
    }    
}

//compilation error because inside parenthesis of the try(resource declaration) we can create the object of only that class that implements the AutoCloseable interface

// Z8.java:8: error: incompatible types: try-with-resources not applicable to variable type
//         try (IOException e = new IOException()) {
//                          ^
//     (IOException cannot be converted to AutoCloseable)
// 1 error
// error: compilation failed