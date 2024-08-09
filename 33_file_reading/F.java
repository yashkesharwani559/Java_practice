import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class F {
    public static void main(String[] args) {
        //program to read the whole contents from file and then print it in the console

        try {

            FileReader fr = new FileReader("abc2.txt");

            char ch[] = new char[10];
            while ((fr.read(ch)) != -1) {
                for (char c : ch) {
                    System.out.print(c);
                }
                Arrays.fill(ch,'\0');
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
//here we use fill(char[], char val) -> static method of the Arrays class that takes the char array and a char val as input and assigns the val to all the elements of the array

//output
// An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold.

// An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold.