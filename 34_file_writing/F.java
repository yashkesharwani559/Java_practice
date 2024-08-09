import java.io.PrintWriter;
import java.io.FileNotFoundException;
 
public class F {
    public static void main(String[] args) {
        
        try{
            PrintWriter pw = new PrintWriter("ac.txt");

            char[] arr = {'a', 'm', 'i', 't'};

            pw.write(arr);

            pw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
