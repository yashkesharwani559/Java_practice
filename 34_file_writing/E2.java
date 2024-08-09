import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
 
public class E2 {
    public static void main(String[] args){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter("xz.txt"));

            pw.println("hello how are you");//gives a line break
            pw.println("hello how are you");

            pw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
