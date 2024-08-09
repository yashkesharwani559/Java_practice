import java.io.FileNotFoundException;
import java.io.FileReader;

public class M1 {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("abc.txt");

        } catch (ArithmeticException e) {

            System.out.println("solution");
   
        } catch (FileNotFoundException e) {

            System.out.println("solve");
            
        }

    }
}
//legal code

//output
// solve