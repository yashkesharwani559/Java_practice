import java.io.FileReader;
import java.io.FileNotFoundException;

public class N1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("solve");
        }
    }
}
//legal code 

//output
// solve