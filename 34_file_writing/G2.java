import java.io.FileWriter;
import java.io.IOException;

public class G2 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("fgh.txt", true);//this will open the file in append mode

            fw.write("  I am fine");
            // how are you -> old
            // how are you  I am fine -> new 

            // means old text is not overridden

            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
