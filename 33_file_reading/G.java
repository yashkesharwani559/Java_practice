import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class G {
    public static void main(String[] args) {
        File f = new File("pqr.txt");  
        
        try {
            
            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String s;
            while ((s = bfr.readLine()) != null){
                System.out.println(s + "==");
            }

            bfr.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
//BufferedReader is a class that is the subclass of the Reader class
// it is present in java.io package
// it has a difficulty that there is no constructor that can take file path or file object as argument.
// here we have the constructor that takes the Reader or its subclass objects as arguments.
// and since FileReader is the subclass of the Reader class, so we can pass its object in the BufferedReader constructor due to polymorphism
// and also FileReader is a raw or fundamental class whereas BufferedReader is an efficient class for the reading from the file
// in the BufferedReader class contains the same method as of the FileReader class, but it has one useful method readLine() which we will study and use here
//String readLine() -> a non-static method that can throw IOException that is a checked exception. it returns a single String value. means it returns one paragraph as string (or a line) and returns null only when all the contents of the file are fully readed(means it returns null when end of the file is reached)

// and BufferedReader(Reader in) -> throws no exceptions at all

// output
// An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. ==
// An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. ==