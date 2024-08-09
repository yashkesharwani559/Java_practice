import java.io.IOException;
import java.io.FileReader;

class X4 {
    public static void main(String[] args) throws IOException {
        
        //Resource Declaration
        try (FileReader fr = new FileReader("abc2.txt");) {
            System.out.println(1);         
            
            System.out.println(fr.read());

            System.out.println(2);            
        }       
    }    
}
//correct code because try with resource declaration can be written individually(without catch or finally)

//output
// 1
// 100
// 2