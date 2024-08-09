import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class G1 {
    public static void main(String[] args) {
        File f = new File("pqr1.txt");

        try {

            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String s;
            while ((s = bfr.readLine()) != null) {
                System.out.println(s + "==");
            }

            bfr.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//so here readLine() method reads the characters until a new line not comes
//output
// An array declaration has two components: the type and the name. type declares the element type of the array.==
// The element type determines the data type of each element that comprises the array.==
// Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. ==
// An array declaration has two components: the type and the name. type declares the element type of the array.==
// The element type determines the data type of each element that comprises the array.==
// Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc.,==
// or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. ==