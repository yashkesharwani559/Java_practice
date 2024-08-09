import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
 
public class C1 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("pqr.txt"));
   
            bw.write("hello how are you");
            bw.write("hello how are you");//here both Strings are added in the same line
               
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//we have come here to see the BufferedWriter class whose objects are also used to write the contents on the file
// BufferedWriter is in java.io package. it has the same write methods as in the FileWriter class.
// BufferedWriter class has no constructor that takes String or File class object as argument but it has a constructor that takes the Writer (parent of the BufferedWriter class) class object as argument
// BufferedWriter(Writer out) -> this constructor has a good point that it doesnot throws any exception
// so here we pass an object of the FileWriter class as argument to this constructor polymorphically.
// but all the methods that are defined in the BufferedWriter class throws the IOException which is a checked exception