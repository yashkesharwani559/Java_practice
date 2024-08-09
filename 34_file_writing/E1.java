import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
 
public class E1 {
    public static void main(String[] args){
        try{
            PrintWriter pw = new PrintWriter(new File("xz.txt"));

            // pw.write("hello how are you");//don't give a line break
            // pw.write("hello how are you");
            
            pw.println("hello how are you");//gives a line break
            pw.println("hello how are you");

            pw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
